package com.destranix.glslang;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public abstract class PointerBoundObject {

	private static final Map<PointerBoundObject, PointerBoundObject> INSTANCES = new HashMap<PointerBoundObject, PointerBoundObject>();

	protected static final String EXCEPTION_MSG_NOT_LOADABLE = "Cannot load element. Element was not created by constructor of this class";
	protected static final String EXCEPTION_MSG_NOT_FREEABLE = "Cannot free element. Element was not created by constructor of this class";

	protected byte[] ptr;

	public void load() {
		load_intern();
		INSTANCES.put(this, this);
	}

	protected abstract void load_intern();

	public void free() {
		PointerBoundObject key = new PointerBoundObjectKey(ptr);
		free_intern();
		INSTANCES.remove(key);
	}

	protected abstract void free_intern();

	protected byte[] getPtr() {
		return ptr;
	}

	public <T extends PointerBoundObject> T cast(Class<T> instanceClass) {
		return fromPtr(ptr, instanceClass);
	}

	@Override
	public boolean equals(Object o) {
		return ((o != null) && (o instanceof PointerBoundObject)
				&& (this.ptr != null && ((PointerBoundObject) o).ptr != null)
				&& (Arrays.equals(this.ptr, ((PointerBoundObject) o).ptr)));
	}

	@Override
	public int hashCode() {
		return Arrays.hashCode(ptr);
	}

	protected static PointerBoundObject fromPtr(byte[] ptr) {
		if (ptr == null) {
			return null;
		}
		boolean isNull = true;
		for (int i = 0; i < ptr.length; ++i) {
			if (ptr[i] != 0) {
				isNull = false;
				break;
			}
		}
		if (isNull) {
			return null;
		}
		return INSTANCES.get(new PointerBoundObjectKey(ptr));
	}

	protected static <T extends PointerBoundObject> T fromPtr(byte[] ptr, Class<T> instanceClass) {
		if (ptr == null) {
			return null;
		}
		boolean isNull = true;
		for (int i = 0; i < ptr.length; ++i) {
			if (ptr[i] != 0) {
				isNull = false;
				break;
			}
		}
		if (isNull) {
			return null;
		}
		PointerBoundObject obj = INSTANCES.get(new PointerBoundObjectKey(ptr));
		T ret;
		if (obj == null || PointerBoundObjectKey.class.equals(instanceClass)) {
			try {
				ret = instanceClass.getDeclaredConstructor(Byte.TYPE.arrayType()).newInstance(ptr);
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException e) {
				throw new AssertionError("An error occured while instancing object.", e);
			}
		} else {
			if (instanceClass.isAssignableFrom(obj.getClass())) {
				ret = instanceClass.cast(obj);
			} else {
				throw new RuntimeException("Cannot cast elemnt to given type!");
			}
		}
		return ret;
	}

	protected static PointerBoundObject fromPtrUndefined(byte[] ptr) {
		return fromPtr(ptr, PointerBoundObjectKey.class);
	}

	protected static class PointerBoundObjectKey extends PointerBoundObject {

		protected PointerBoundObjectKey(byte[] ptr) {
			this.ptr = ptr;
		}

		@Override
		public int hashCode() {
			return Arrays.hashCode(ptr);
		}

		@Override
		protected void load_intern() {
			throw new IllegalStateException("Cannot load element of unknown type");
		}

		@Override
		public void free_intern() {
			throw new IllegalStateException("Cannot free element of unknown type");
		}

	}

}
