package Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CMap<K extends PointerBoundObject, V extends PointerBoundObject> extends PointerBoundObject
		implements Map<PointerBoundObject, PointerBoundObject> {

	private final int constructorIndex;

	public CMap() {
		this.constructorIndex = 0;
		load();
	}

	protected CMap(PoisonClass p) {
		this.constructorIndex = -1;
	}

	protected CMap(byte[] ptr) {
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
					ptr = Main.CMap();
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
		return Main.CMap_size(ptr);
	}

	@Override
	public boolean isEmpty() {
		return Main.CMap_isEmpty(ptr);
	}

	@Override
	public boolean containsKey(Object key) {
		if (key == null || !(PointerBoundObject.class.isAssignableFrom(key.getClass()))) {
			return false;
		} else {
			return Main.CMap_containsKey(ptr, ((PointerBoundObject) key).getPtr());
		}
	}

	@Override
	public boolean containsValue(Object value) {
		if (value == null || !(PointerBoundObject.class.isAssignableFrom(value.getClass()))) {
			return false;
		} else {
			return Main.CMap_containsValue(ptr, ((PointerBoundObject) value).getPtr());
		}
	}

	@Override
	public PointerBoundObject get(Object key) {
		if (key == null || !(PointerBoundObject.class.isAssignableFrom(key.getClass()))) {
			return null;
		} else {
			return fromPtrUndefined(Main.CMap_get(ptr, ((PointerBoundObject) key).getPtr()));
		}
	}

	public PointerBoundObject putSafe(K key, V value) {
		return put(key, value);
	}

	@Override
	public PointerBoundObject put(PointerBoundObject key, PointerBoundObject value) {
		return fromPtrUndefined(Main.CMap_put(ptr, key.getPtr(), value.getPtr()));
	}

	@Override
	public PointerBoundObject remove(Object key) {
		if (key == null || !(PointerBoundObject.class.isAssignableFrom(key.getClass()))) {
			return null;
		} else {
			return fromPtrUndefined(Main.CMap_remove(ptr, ((PointerBoundObject) key).getPtr()));
		}
	}

	public void putAllSafe(Map<? extends K, ? extends V> m) {
		putAll(m);
	}

	@Override
	public void putAll(Map<? extends PointerBoundObject, ? extends PointerBoundObject> m) {
		for (Map.Entry<? extends PointerBoundObject, ? extends PointerBoundObject> entry : m.entrySet()) {
			put(entry.getKey(), entry.getValue());
		}
	}

	@Override
	public void clear() {
		Main.CMap_clear(ptr);
	}

	@Override
	public Set<PointerBoundObject> keySet() {
		@SuppressWarnings("unchecked") // Is checked
		CSet<PointerBoundObject> tmp = (CSet<PointerBoundObject>) fromPtr(Main.CMap_keySet(ptr), CSet.class);
		Set<PointerBoundObject> ret = new HashSet<PointerBoundObject>(tmp);
		Main.delete(tmp.getPtr());
		tmp.ptr = null;
		return ret;
	}

	@Override
	public List<PointerBoundObject> values() {
		@SuppressWarnings("unchecked") // Is checked
		CList<PointerBoundObject> tmp = (CList<PointerBoundObject>) fromPtr(Main.CMap_values(ptr), CList.class);
		List<PointerBoundObject> ret = new ArrayList<PointerBoundObject>(tmp);
		Main.delete(tmp.getPtr());
		tmp.ptr = null;
		return ret;
	}

	@Override
	public Set<Entry<PointerBoundObject, PointerBoundObject>> entrySet() {
		byte[] array = Main.CMap_entries(ptr);
		int size = Main.Array_size(array);
		Set<Entry<PointerBoundObject, PointerBoundObject>> ret = new HashSet<Entry<PointerBoundObject, PointerBoundObject>>(
				size);
		for (int i = 0; i < size; ++i) {
			@SuppressWarnings("unchecked") // Is checked
			Entry<PointerBoundObject, PointerBoundObject> tmp = (Entry<PointerBoundObject, PointerBoundObject>) fromPtr(
					Main.Array_get(array, i), CEntry.class);
			ret.add(tmp);
		}
		Main.delete(array);
		return ret;
	}

	protected static class CEntry<K extends PointerBoundObject, V extends PointerBoundObject> extends PointerBoundObject
			implements Entry<PointerBoundObject, PointerBoundObject> {

		private final int constructorIndex;

		public CEntry() {
			this.constructorIndex = 0;
			load();
		}

		protected CEntry(PoisonClass p) {
			this.constructorIndex = -1;
		}

		protected CEntry(byte[] ptr) {
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
						ptr = Main.CEntry();
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
			return fromPtrUndefined(Main.CEntry_getKey(ptr));
		}

		@Override
		public PointerBoundObject getValue() {
			return fromPtrUndefined(Main.CEntry_getValue(ptr));
		}

		public PointerBoundObject setValueSafe(V value) {
			return setValue(value);
		}

		@Override
		public PointerBoundObject setValue(PointerBoundObject value) {
			return fromPtrUndefined(Main.CEntry_setValue(ptr, value.getPtr()));
		}

	}

}
