package com.destranix.glslang;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Set;

public class CSet<V extends PointerBoundObject> extends PointerBoundObject implements Set<PointerBoundObject> {

	private final int constructorIndex;

	public CSet() {
		this.constructorIndex = 0;
		load();
	}

	protected CSet(PoisonClass p) {
		this.constructorIndex = -1;
	}

	protected CSet(byte[] ptr) {
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
					ptr = Main.CSet();
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
		return Main.CSet_size(ptr);
	}

	@Override
	public boolean isEmpty() {
		return Main.CSet_isEmpty(ptr);
	}

	@Override
	public boolean contains(Object o) {
		if (o == null || !(PointerBoundObject.class.isAssignableFrom(o.getClass()))) {
			return false;
		} else {
			return Main.CSet_contains(ptr, ((PointerBoundObject) o).getPtr());
		}
	}

	@Override
	public CIterator<PointerBoundObject> iterator() {
		@SuppressWarnings("unchecked") // Is checked
		CIterator<PointerBoundObject> tmp = (CIterator<PointerBoundObject>) fromPtr(Main.CSet_iterator(ptr),
				CIterator.class);
		return tmp;
	}

	@Override
	public Object[] toArray() {
		Object[] ret = new Object[size()];
		int i = 0;
		for (PointerBoundObject element : this) {
			ret[i] = element;
			++i;
		}
		return ret;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		if (PointerBoundObject.class.isAssignableFrom(a.getClass().getComponentType())) {
			if (a.length < size()) {
				@SuppressWarnings("unchecked") // Is checked
				T[] tmp = (T[]) Array.newInstance(a.getClass().getComponentType(), size());
				a = tmp;
			} else if (a.length > size()) {
				a[size()] = null;
			}
			int i = 0;
			for (PointerBoundObject element : this) {
				@SuppressWarnings("unchecked") // Is checked
				T tmp = (T) element;
				a[i] = tmp;
				++i;
			}
			return a;
		} else {
			throw new ClassCastException("Cannot cast Pointer to given type!");
		}
	}

	public boolean addSafe(V e) {
		return add(e);
	}

	@Override
	public boolean add(PointerBoundObject e) {
		return Main.CSet_add(ptr, e.getPtr());
	}

	@Override
	public boolean remove(Object o) {
		if (o == null || !(PointerBoundObject.class.isAssignableFrom(o.getClass()))) {
			return false;
		} else {
			return Main.CSet_remove(ptr, ((PointerBoundObject) o).getPtr());
		}
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		for (Object o : c) {
			if (!contains(o)) {
				return false;
			}
		}
		return true;
	}

	public boolean addAllSafe(Collection<? extends V> c) {
		return addAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends PointerBoundObject> c) {
		if (c == null || c.size() == 0) {
			return false;
		}
		for (PointerBoundObject elem : c) {
			add(elem);
		}
		return true;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		boolean changed = false;
		for (Object o : c) {
			if (remove(o)) {
				changed = true;
			}
		}
		return changed;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		boolean changed = false;
		for (Object o : this) {
			if (!c.contains(o)) {
				remove(o);
				changed = true;
			}
		}
		return changed;
	}

	@Override
	public void clear() {
		Main.CSet_clear(ptr);
	}

}
