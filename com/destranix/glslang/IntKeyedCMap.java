package com.destranix.glslang;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IntKeyedCMap<V extends PointerBoundObject> extends PointerBoundObject
		implements Map<Integer, PointerBoundObject> {

	private final int constructorIndex;

	public IntKeyedCMap() {
		this.constructorIndex = 0;
		load();
	}

	protected IntKeyedCMap(PoisonClass p) {
		this.constructorIndex = -1;
	}

	protected IntKeyedCMap(byte[] ptr) {
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
					ptr = Main.IntKeyedCMap();
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
		return Main.IntKeyedCMap_size(ptr);
	}

	@Override
	public boolean isEmpty() {
		return Main.IntKeyedCMap_isEmpty(ptr);
	}

	public boolean containsKey(int key) {
		return Main.IntKeyedCMap_containsKey(ptr, key);
	}

	@Override
	public boolean containsKey(Object key) {
		if (key == null || !(Integer.class.isAssignableFrom(key.getClass()))) {
			return false;
		} else {
			return containsKey(((Integer) key).intValue());
		}
	}

	@Override
	public boolean containsValue(Object value) {
		if (value == null || !(PointerBoundObject.class.isAssignableFrom(value.getClass()))) {
			return false;
		} else {
			return Main.IntKeyedCMap_containsValue(ptr, ((PointerBoundObject) value).getPtr());
		}
	}

	public PointerBoundObject get(int key) {
		return fromPtrUndefined(Main.IntKeyedCMap_get(ptr, key));
	}

	@Override
	public PointerBoundObject get(Object key) {
		if (key == null || !(Integer.class.isAssignableFrom(key.getClass()))) {
			return null;
		} else {
			return get(((Integer) key).intValue());
		}
	}

	public PointerBoundObject putSafe(Integer key, V value) {
		return put(key.intValue(), value);
	}

	public PointerBoundObject putSafe(int key, V value) {
		return put(key, value);
	}

	public PointerBoundObject put(int key, PointerBoundObject value) {
		return fromPtrUndefined(Main.IntKeyedCMap_put(ptr, key, value.getPtr()));
	}

	@Override
	public PointerBoundObject put(Integer key, PointerBoundObject value) {
		return put(key.intValue(), value);
	}

	public PointerBoundObject remove(int key) {
		return fromPtrUndefined(Main.IntKeyedCMap_remove(ptr, key));
	}

	@Override
	public PointerBoundObject remove(Object key) {
		if (key == null || !(Integer.class.isAssignableFrom(key.getClass()))) {
			return null;
		} else {
			return remove(((Integer) key).intValue());
		}
	}

	public void putAllSafe(Map<? extends Integer, ? extends V> m) {
		putAll(m);
	}

	@Override
	public void putAll(Map<? extends Integer, ? extends PointerBoundObject> m) {
		for (Map.Entry<? extends Integer, ? extends PointerBoundObject> entry : m.entrySet()) {
			put(entry.getKey(), entry.getValue());
		}
	}

	@Override
	public void clear() {
		Main.IntKeyedCMap_clear(ptr);
	}

	@Override
	public Set<Integer> keySet() {
		int[] keys = Main.IntKeyedCMap_keys(ptr);
		Set<Integer> ret = new HashSet<Integer>(keys.length);
		for (int i = 0; i < keys.length; ++i) {
			ret.add(Integer.valueOf(i));
		}
		return ret;
	}

	@Override
	public List<PointerBoundObject> values() {
		@SuppressWarnings("unchecked") // Is checked
		CList<PointerBoundObject> tmp = (CList<PointerBoundObject>) fromPtr(Main.IntKeyedCMap_values(ptr), CList.class);
		List<PointerBoundObject> ret = new ArrayList<PointerBoundObject>(tmp);
		Main.delete(tmp.getPtr());
		tmp.ptr = null;
		return ret;
	}

	@Override
	public Set<Entry<Integer, PointerBoundObject>> entrySet() {
		byte[] array = Main.IntKeyedCMap_entries(ptr);
		int size = Main.Array_size(array);
		Set<Entry<Integer, PointerBoundObject>> ret = new HashSet<Entry<Integer, PointerBoundObject>>(size);
		for (int i = 0; i < size; ++i) {
			@SuppressWarnings("unchecked") // Is checked
			Entry<Integer, PointerBoundObject> tmp = (Entry<Integer, PointerBoundObject>) fromPtr(
					Main.Array_get(array, i), IntKeyedCEntry.class);
			ret.add(tmp);
		}
		Main.delete(array);
		return ret;
	}

	protected static class IntKeyedCEntry<V extends PointerBoundObject> extends PointerBoundObject
			implements Entry<Integer, PointerBoundObject> {

		private final int constructorIndex;

		public IntKeyedCEntry() {
			this.constructorIndex = 0;
			load();
		}

		protected IntKeyedCEntry(PoisonClass p) {
			this.constructorIndex = -1;
		}

		protected IntKeyedCEntry(byte[] ptr) {
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
						ptr = Main.IntKeyedCEntry();
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

		public int getKeyInt() {
			return Main.IntKeyedCEntry_getKey(ptr);
		}

		@Override
		public Integer getKey() {
			return Integer.valueOf(getKeyInt());
		}

		@Override
		public PointerBoundObject getValue() {
			return fromPtrUndefined(Main.IntKeyedCEntry_getValue(ptr));
		}

		public PointerBoundObject setValueSafe(V value) {
			return setValue(value);
		}

		@Override
		public PointerBoundObject setValue(PointerBoundObject value) {
			return fromPtrUndefined(Main.IntKeyedCEntry_setValue(ptr, value.getPtr()));
		}

	}

}
