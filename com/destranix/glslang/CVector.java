package com.destranix.glslang;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class CVector<V extends PointerBoundObject> extends PointerBoundObject
		implements List<PointerBoundObject>, RandomAccess {

	private final int constructorIndex;

	public CVector() {
		this.constructorIndex = 0;
		load();
	}

	protected CVector(PoisonClass p) {
		this.constructorIndex = -1;
	}

	protected CVector(byte[] ptr) {
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
					ptr = Main.CVector();
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
		return Main.CVector_size(ptr);
	}

	@Override
	public boolean isEmpty() {
		return Main.CVector_isEmpty(ptr);
	}

	@Override
	public boolean contains(Object o) {
		if (o == null || !(PointerBoundObject.class.isAssignableFrom(o.getClass()))) {
			return false;
		} else {
			return Main.CVector_contains(ptr, ((PointerBoundObject) o).getPtr());
		}
	}

	@Override
	public CIterator<PointerBoundObject> iterator() {
		@SuppressWarnings("unchecked") // Is checked
		CIterator<PointerBoundObject> tmp = (CIterator<PointerBoundObject>) fromPtr(Main.CVector_iterator(ptr),
				CIterator.class);
		return tmp;
	}

	@Override
	public Object[] toArray() {
		int size = size();
		Object[] ret = new Object[size];
		for (int i = 0; i < size; ++i) {
			ret[i] = get(i);
		}
		return ret;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		int size = size();
		if (a.length < size) {
			@SuppressWarnings("unchecked") // Is checked
			T[] tmp = (T[]) Array.newInstance(a.getClass().getComponentType(), size);
			a = tmp;
		} else if (a.length > size) {
			a[size] = null;
		}
		for (int i = 0; i < size; ++i) {
			@SuppressWarnings("unchecked")
			T tmp = (T) get(i);
			a[i] = tmp;
		}
		return a;
	}

	public boolean addSafe(V e) {
		return add(e);
	}

	@Override
	public boolean add(PointerBoundObject e) {
		return Main.CVector_add(ptr, e.getPtr());
	}

	@Override
	public boolean remove(Object o) {
		if (o == null || !(PointerBoundObject.class.isAssignableFrom(o.getClass()))) {
			return false;
		} else {
			return Main.CVector_remove(ptr, ((PointerBoundObject) o).getPtr());
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

	public boolean addAllSafe(int index, Collection<? extends V> c) {
		return addAll(index, c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends PointerBoundObject> c) {
		checkIndex(0, size() + 1, index);
		if (c == null || c.size() == 0) {
			return false;
		}
		byte[][] ptrs = new byte[c.size()][];
		int i = 0;
		for (PointerBoundObject elem : c) {
			ptrs[i] = elem.getPtr();
			i++;
		}
		byte[] arr = Main.createArray(ptrs);
		Main.CVector_insert(ptr, index, arr);
		Main.delete(arr);
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
		Main.CVector_clear(ptr);
	}

	@Override
	public PointerBoundObject get(int index) {
		checkIndex(index);
		return fromPtrUndefined(Main.CVector_get(ptr, index));
	}

	public PointerBoundObject setSafe(int index, V element) {
		return set(index, element);
	}

	@Override
	public PointerBoundObject set(int index, PointerBoundObject element) {
		checkIndex(index);
		return fromPtrUndefined(Main.CVector_set(ptr, index, element.getPtr()));
	}

	public void addSafe(int index, V element) {
		add(index, element);
	}

	@Override
	public void add(int index, PointerBoundObject element) {
		checkIndex(0, size() + 1, index);
		Main.CVector_add(ptr, index, element.getPtr());
	}

	@Override
	public PointerBoundObject remove(int index) {
		checkIndex(index);
		return fromPtrUndefined(Main.CVector_remove(ptr, index));
	}

	@Override
	public int indexOf(Object o) {
		if (o == null || !(PointerBoundObject.class.isAssignableFrom(o.getClass()))) {
			return -1;
		} else {
			return Main.CVector_indexOf(ptr, ((PointerBoundObject) o).getPtr());
		}
	}

	@Override
	public int lastIndexOf(Object o) {
		if (o == null || !(PointerBoundObject.class.isAssignableFrom(o.getClass()))) {
			return -1;
		} else {
			return Main.CVector_lastIndexOf(ptr, ((PointerBoundObject) o).getPtr());
		}
	}

	@Override
	public CListIterator<PointerBoundObject> listIterator() {
		@SuppressWarnings("unchecked") // Is checked
		CListIterator<PointerBoundObject> tmp = (CListIterator<PointerBoundObject>) fromPtr(
				Main.CVector_listIterator(ptr), CListIterator.class);
		return tmp;
	}

	@Override
	public CListIterator<PointerBoundObject> listIterator(int index) {
		@SuppressWarnings("unchecked") // Is checked
		CListIterator<PointerBoundObject> tmp = (CListIterator<PointerBoundObject>) fromPtr(
				Main.CVector_listIterator(ptr, index), CListIterator.class);
		return tmp;
	}

	@Override
	public CSubList<PointerBoundObject> subList(int fromIndex, int toIndex) {
		checkIndex(fromIndex);
		checkIndex(0, size() + 1, toIndex);
		if (toIndex < fromIndex) {
			throw new IndexOutOfBoundsException("fromIndex is greater than toIndex");
		}
		@SuppressWarnings("unchecked") // Is checked
		CSubList<PointerBoundObject> tmp = (CSubList<PointerBoundObject>) new CSubList<V>(this, fromIndex, toIndex);
		return tmp;
	}

	protected final void checkIndex(int index) {
		checkIndex(0, size(), index);
	}

	protected static final void checkIndex(int start, int end, int index) {
		if (index < start || index >= end) {
			throw new IndexOutOfBoundsException(index);
		}
	}

	protected static class CSubList<V extends PointerBoundObject> implements List<PointerBoundObject> {

		private final List<PointerBoundObject> parent;
		protected int start;
		protected int end;

		public CSubList(List<PointerBoundObject> parent, int start) {
			this(parent, start, -1);

		}

		public CSubList(List<PointerBoundObject> parent, int start, int end) {
			this.parent = parent;
			this.start = start;
			this.end = end;
		}

		@Override
		public int size() {
			return end - start;
		}

		@Override
		public boolean isEmpty() {
			return (size() == 0);
		}

		@Override
		public boolean contains(Object o) {
			int index = parent.indexOf(o);
			return (index >= start && index < end);
		}

		@Override
		public CSubListIterator<PointerBoundObject> iterator() {
			@SuppressWarnings("unchecked")
			CSubListIterator<PointerBoundObject> tmp = (CSubListIterator<PointerBoundObject>) new CSubListIterator<V>(
					(CSubList<PointerBoundObject>) this);
			return tmp;
		}

		@Override
		public Object[] toArray() {
			int size = size();
			Object[] ret = new Object[size];
			for (int i = 0; i < size; ++i) {
				ret[i] = get(i);
			}
			return ret;
		}

		@Override
		public <T> T[] toArray(T[] a) {
			int size = size();
			if (a.length < size) {
				@SuppressWarnings("unchecked") // Is checked
				T[] tmp = (T[]) Array.newInstance(a.getClass().getComponentType(), size);
				a = tmp;
			} else if (a.length > size) {
				a[size] = null;
			}
			for (int i = 0; i < size; ++i) {
				@SuppressWarnings("unchecked")
				T tmp = (T) get(i);
				a[i] = tmp;
			}
			return a;
		}

		public boolean addSafe(V e) {
			return add(e);
		}

		@Override
		public boolean add(PointerBoundObject e) {
			add(end, e);
			end++;
			return true;
		}

		@Override
		public boolean remove(Object o) {
			Iterator<PointerBoundObject> iter = this.iterator();
			while (iter.hasNext()) {
				if (iter.next().equals(o)) {
					iter.remove();
					return true;
				}
			}
			return false;
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

		public boolean addAllSafe(int index, Collection<? extends V> c) {
			return addAll(index, c);
		}

		@Override
		public boolean addAll(int index, Collection<? extends PointerBoundObject> c) {
			checkIndex(0, size() + 1, index);
			boolean ret = parent.addAll(start + index, c);
			if (ret) {
				end += c.size();
			}
			return ret;
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
			parent.clear();
		}

		@Override
		public PointerBoundObject get(int index) {
			checkIndex(index);
			return parent.get(start + index);
		}

		public PointerBoundObject setSafe(int index, V element) {
			return set(index, element);
		}

		@Override
		public PointerBoundObject set(int index, PointerBoundObject element) {
			checkIndex(index);
			return parent.set(start + index, element);
		}

		public void addSafe(int index, V element) {
			add(index, element);
		}

		@Override
		public void add(int index, PointerBoundObject element) {
			checkIndex(0, size() + 1, index);
			parent.add(start + index, element);
		}

		@Override
		public PointerBoundObject remove(int index) {
			checkIndex(index);
			return parent.remove(start + index);
		}

		@Override
		public int indexOf(Object o) {
			int index = parent.indexOf(o);
			if (index >= start && index < end) {
				return index - start;
			} else {
				return -1;
			}
		}

		@Override
		public int lastIndexOf(Object o) {
			int index = parent.lastIndexOf(o);
			if (index >= start && index < end) {
				return index - start;
			} else {
				return -1;
			}
		}

		@Override
		public CSubListIterator<PointerBoundObject> listIterator() {
			@SuppressWarnings("unchecked")
			CSubListIterator<PointerBoundObject> tmp = (CSubListIterator<PointerBoundObject>) new CSubListIterator<V>(
					(CSubList<PointerBoundObject>) this);
			return tmp;
		}

		@Override
		public CSubListIterator<PointerBoundObject> listIterator(int index) {
			@SuppressWarnings("unchecked")
			CSubListIterator<PointerBoundObject> tmp = (CSubListIterator<PointerBoundObject>) new CSubListIterator<V>(
					(CSubList<PointerBoundObject>) this, index);
			return tmp;
		}

		@Override
		public CSubList<PointerBoundObject> subList(int fromIndex, int toIndex) {
			checkIndex(fromIndex);
			checkIndex(0, size() + 1, toIndex);
			if (toIndex < fromIndex) {
				throw new IndexOutOfBoundsException("fromIndex is greater than toIndex");
			}
			@SuppressWarnings("unchecked") // Is checked
			CSubList<PointerBoundObject> tmp = (CSubList<PointerBoundObject>) new CSubList<V>(this, fromIndex, toIndex);
			return tmp;
		}

		protected final void checkIndex(int index) {
			checkIndex(0, size(), index);
		}

		protected static final void checkIndex(int start, int end, int index) {
			if (index < start || index >= end) {
				throw new IndexOutOfBoundsException(index);
			}
		}

		protected static class CSubListIterator<V extends PointerBoundObject>
				implements Iterator<PointerBoundObject>, ListIterator<PointerBoundObject> {

			private final CSubList<PointerBoundObject> parent;
			private int index;

			CSubListIterator(CSubList<PointerBoundObject> parent) {
				this.parent = parent;
				this.index = parent.start;
			}

			CSubListIterator(CSubList<PointerBoundObject> parent, int index) {
				this.parent = parent;
				this.index = index;
			}

			@Override
			public boolean hasNext() {
				return index < parent.end;
			}

			@Override
			public PointerBoundObject next() {
				return parent.get(index++);
			}

			@Override
			public boolean hasPrevious() {
				return index >= parent.start;
			}

			@Override
			public PointerBoundObject previous() {
				return parent.get(--index);
			}

			@Override
			public int nextIndex() {
				return index;
			}

			@Override
			public int previousIndex() {
				return index - 1;
			}

			@Override
			public void remove() {
				parent.remove(index);
			}

			@Override
			public void set(PointerBoundObject e) {
				parent.set(index, e);
			}

			@Override
			public void add(PointerBoundObject e) {
				parent.add(index, e);
			}

		}

	}

	protected static class CListIterator<V extends PointerBoundObject> extends CIterator<V>
			implements ListIterator<PointerBoundObject> {

		private final int constructorIndex;

		protected CListIterator(PoisonClass p) {
			super(p);
			this.constructorIndex = -1;
		}

		protected CListIterator(byte[] ptr) {
			super(ptr);
			this.constructorIndex = -1;
		}

		@Override
		protected void load_intern() {
			if (ptr == null) {
				switch (constructorIndex) {
					case -1:
						throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
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
					default:
						throw new AssertionError("Reached unreachable state!");
				}
			}
		}

		@Override
		public boolean hasPrevious() {
			return Main.CListIterator_hasPrevious(ptr);
		}

		@Override
		public PointerBoundObject previous() {
			return fromPtrUndefined(Main.CListIterator_previous(ptr));
		}

		@Override
		public int nextIndex() {
			return Main.CListIterator_nextIndex(ptr);
		}

		@Override
		public int previousIndex() {
			return Main.CListIterator_previousIndex(ptr);
		}

		@Override
		public void remove() {
			Main.CListIterator_remove(ptr);
		}

		public void setSafe(V e) {
			set(e);
		}

		@Override
		public void set(PointerBoundObject e) {
			Main.CListIterator_set(ptr, e.getPtr());
		}

		public void addSafe(V e) {
			add(e);
		}

		@Override
		public void add(PointerBoundObject e) {
			Main.CListIterator_add(ptr, e.getPtr());
		}

	}
}
