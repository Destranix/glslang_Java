package Java;

import java.util.Iterator;

public class CIterator<V extends PointerBoundObject> extends PointerBoundObject
		implements Iterator<PointerBoundObject> {

	private final int constructorIndex;

	protected CIterator(PoisonClass p) {
		this.constructorIndex = -1;
	}

	protected CIterator(byte[] ptr) {
		this.ptr = ptr;
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
	public boolean hasNext() {
		return Main.CIterator_hasNext(ptr);
	}

	@Override
	public PointerBoundObject next() {
		return fromPtrUndefined(Main.CIterator_next(ptr));
	}
}
