package com.destranix.glslang;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IntKeyedIntArrayCMap extends PointerBoundObject implements Map<Integer, int[]> {

	private final int constructorIndex;

	public IntKeyedIntArrayCMap() {
		this.constructorIndex = 0;
		load();
	}

	protected IntKeyedIntArrayCMap(PoisonClass p) {
		this.constructorIndex = -1;
	}

	protected IntKeyedIntArrayCMap(byte[] ptr) {
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
					ptr = Main.IntKeyedIntArrayCMap();
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
		return Main.IntKeyedIntArrayCMap_size(ptr);
	}

	@Override
	public boolean isEmpty() {
		return Main.IntKeyedIntArrayCMap_isEmpty(ptr);
	}

	public boolean containsKey(int key) {
		return Main.IntKeyedIntArrayCMap_containsKey(ptr, key);
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
		if (value == null || !(Integer.TYPE.arrayType().isAssignableFrom(value.getClass()))) {
			return false;
		} else {
			return Main.IntKeyedIntArrayCMap_containsValue(ptr, (int[]) value);
		}
	}

	public int[] get(int key) {
		return Main.IntKeyedIntArrayCMap_get(ptr, key);
	}

	@Override
	public int[] get(Object key) {
		if (key == null || !(Integer.class.isAssignableFrom(key.getClass()))) {
			return null;
		} else {
			return get(((Integer) key).intValue());
		}
	}

	public int[] put(int key, int[] value) {
		return Main.IntKeyedIntArrayCMap_put(ptr, key, value);
	}

	@Override
	public int[] put(Integer key, int[] value) {
		return put(key.intValue(), value);
	}

	public int[] remove(int key) {
		return Main.IntKeyedIntArrayCMap_remove(ptr, key);
	}

	@Override
	public int[] remove(Object key) {
		if (key == null || !(Integer.class.isAssignableFrom(key.getClass()))) {
			return null;
		} else {
			return remove(((Integer) key).intValue());
		}
	}

	@Override
	public void putAll(Map<? extends Integer, ? extends int[]> m) {
		for (Map.Entry<? extends Integer, ? extends int[]> entry : m.entrySet()) {
			put(entry.getKey().intValue(), entry.getValue());
		}
	}

	@Override
	public void clear() {
		Main.IntKeyedIntArrayCMap_clear(ptr);
	}

	@Override
	public Set<Integer> keySet() {
		int[] keys = Main.IntKeyedIntArrayCMap_keys(ptr);
		Set<Integer> ret = new HashSet<Integer>(keys.length);
		for (int i = 0; i < keys.length; ++i) {
			ret.add(Integer.valueOf(i));
		}
		return ret;
	}

	@Override
	public Collection<int[]> values() {
		return Arrays.asList(Main.IntKeyedIntArrayCMap_values(ptr));
	}

	@Override
	public Set<Entry<Integer, int[]>> entrySet() {
		byte[] array = Main.IntKeyedIntArrayCMap_entries(ptr);
		int size = Main.Array_size(array);
		Set<Entry<Integer, int[]>> ret = new HashSet<Entry<Integer, int[]>>(size);
		for (int i = 0; i < size; ++i) {
			Entry<Integer, int[]> tmp = (Entry<Integer, int[]>) fromPtr(Main.Array_get(array, i),
					IntKeyedIntArrayCEntry.class);
			ret.add(tmp);
		}
		Main.delete(array);
		return ret;
	}

	protected static class IntKeyedIntArrayCEntry extends PointerBoundObject implements Entry<Integer, int[]> {

		private final int constructorIndex;

		public IntKeyedIntArrayCEntry() {
			this.constructorIndex = 0;
			load();
		}

		protected IntKeyedIntArrayCEntry(PoisonClass p) {
			this.constructorIndex = -1;
		}

		protected IntKeyedIntArrayCEntry(byte[] ptr) {
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
						ptr = Main.IntKeyedIntArrayCEntry();
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
			return Main.IntKeyedIntArrayCEntry_getKey(ptr);
		}

		@Override
		public Integer getKey() {
			return Integer.valueOf(getKeyInt());
		}

		@Override
		public int[] getValue() {
			return Main.IntKeyedIntArrayCEntry_getValue(ptr);
		}

		@Override
		public int[] setValue(int[] value) {
			return Main.IntKeyedIntArrayCEntry_setValue(ptr, value);
		}

	}

}
