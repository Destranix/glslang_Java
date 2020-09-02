package com.destranix.glslang;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class IntCMap<K extends PointerBoundObject> extends PointerBoundObject
		implements Map<PointerBoundObject, Integer> {

	private final int constructorIndex;

	public IntCMap() {
		this.constructorIndex = 0;
		load();
	}

	protected IntCMap(PoisonClass p) {
		this.constructorIndex = -1;
	}

	protected IntCMap(byte[] ptr) {
		this.ptr = ptr;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.IntCMap();
					break;
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	@Override
	protected void free_intern() {
		if (ptr != null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_FREEABLE);
				case 0:
					Main.delete(ptr);
					ptr = null;
					break;
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	@Override
	public int size() {
		return Main.IntCMap_size(ptr);
	}

	@Override
	public boolean isEmpty() {
		return Main.IntCMap_isEmpty(ptr);
	}

	@Override
	public boolean containsKey(Object key) {
		if (key == null || !(PointerBoundObject.class.isAssignableFrom(key.getClass()))) {
			return false;
		} else {
			return Main.IntCMap_containsKey(ptr, ((PointerBoundObject) key).getPtr());
		}
	}

	public boolean containsValue(int value) {
		return Main.IntCMap_containsValue(ptr, value);
	}

	@Override
	public boolean containsValue(Object value) {
		if (value == null || !(Integer.class.isAssignableFrom(value.getClass()))) {
			return false;
		} else {
			return containsValue(((Integer) value).intValue());
		}
	}

	public int getInt(Object key) {
		return Main.IntCMap_get(ptr, ((PointerBoundObject) key).getPtr());
	}

	@Override
	public Integer get(Object key) {
		if (key == null || !(PointerBoundObject.class.isAssignableFrom(key.getClass()))) {
			return null;
		} else {
			return Integer.valueOf(getInt(key));
		}
	}

	public int putInt(PointerBoundObject key, int value) {
		return Main.IntCMap_put(ptr, key.getPtr(), value);
	}

	public int putInt(PointerBoundObject key, Integer value) {
		return put(key, value.intValue());
	}

	public Integer put(PointerBoundObject key, int value) {
		return Integer.valueOf(putInt(key, value));
	}

	@Override
	public Integer put(PointerBoundObject key, Integer value) {
		return Integer.valueOf(putInt(key, value.intValue()));
	}

	@Override
	public Integer remove(Object key) {
		if (key == null || !(PointerBoundObject.class.isAssignableFrom(key.getClass()))) {
			return null;
		} else {
			return Integer.valueOf(Main.IntCMap_remove(ptr, ((PointerBoundObject) key).getPtr()));
		}
	}

	public void putAllSafe(Map<? extends K, ? extends Integer> m) {
		putAll(m);
	}

	@Override
	public void putAll(Map<? extends PointerBoundObject, ? extends Integer> m) {
		for (Map.Entry<? extends PointerBoundObject, ? extends Integer> entry : m.entrySet()) {
			put(entry.getKey(), entry.getValue());
		}
	}

	@Override
	public void clear() {
		Main.IntCMap_clear(ptr);
	}

	@Override
	public Set<PointerBoundObject> keySet() {
		@SuppressWarnings("unchecked") // Is checked
		CSet<PointerBoundObject> tmp = (CSet<PointerBoundObject>) fromPtr(Main.IntCMap_keySet(ptr), CSet.class);
		Set<PointerBoundObject> ret = new HashSet<PointerBoundObject>(tmp);
		Main.delete(tmp.getPtr());
		tmp.ptr = null;
		return ret;
	}

	@Override
	public Collection<Integer> values() {
		return Arrays.stream(Main.IntCMap_values(ptr)).boxed().collect(Collectors.toList());
	}

	@Override
	public Set<Entry<PointerBoundObject, Integer>> entrySet() {
		byte[] array = Main.IntCMap_entries(ptr);
		int size = Main.Array_size(array);
		Set<Entry<PointerBoundObject, Integer>> ret = new HashSet<Entry<PointerBoundObject, Integer>>(size);
		for (int i = 0; i < size; ++i) {
			@SuppressWarnings("unchecked") // Is checked
			Entry<PointerBoundObject, Integer> tmp = (Entry<PointerBoundObject, Integer>) fromPtr(
					Main.Array_get(array, i), IntCEntry.class);
			ret.add(tmp);
		}
		Main.delete(array);
		return ret;
	}

	protected static class IntCEntry<K extends PointerBoundObject> extends PointerBoundObject
			implements Entry<PointerBoundObject, Integer> {

		private final int constructorIndex;

		public IntCEntry() {
			this.constructorIndex = 0;
			load();
		}

		protected IntCEntry(PoisonClass p) {
			this.constructorIndex = -1;
		}

		protected IntCEntry(byte[] ptr) {
			this.ptr = ptr;
			this.constructorIndex = -1;
		}

		@Override
		protected void load_intern() {
			if (ptr == null) {
				switch (constructorIndex) {
					case -1:
						throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
					case 0:
						ptr = Main.IntCEntry();
						break;
					default:
						throw new AssertionError("Reached unreachable state!");
				}
			}
		}

		@Override
		protected void free_intern() {
			if (ptr != null) {
				switch (constructorIndex) {
					case -1:
						throw new IllegalStateException(EXCEPTION_MSG_NOT_FREEABLE);
					case 0:
						Main.delete(ptr);
						ptr = null;
						break;
					default:
						throw new AssertionError("Reached unreachable state!");
				}
			}
		}

		@Override
		public PointerBoundObject getKey() {
			return fromPtrUndefined(Main.IntCEntry_getKey(ptr));
		}

		public int getValueInt() {
			return Main.IntCEntry_getValue(ptr);
		}

		@Override
		public Integer getValue() {
			return Integer.valueOf(getValueInt());
		}

		public int setValueInt(int value) {
			return Main.IntCEntry_setValue(ptr, value);
		}

		public Integer setValue(int value) {
			return Integer.valueOf(setValueInt(value));
		}

		public int setValueInt(Integer value) {
			return setValueInt(value.intValue());
		}

		@Override
		public Integer setValue(Integer value) {
			return Integer.valueOf(setValueInt(value.intValue()));
		}

	}

}
