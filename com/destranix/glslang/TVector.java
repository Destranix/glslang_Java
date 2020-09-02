package com.destranix.glslang;

public class TVector<V extends PointerBoundObject> extends CVector<V> {

	private final pool_allocator allocator;
	private final int i;
	private final PointerBoundObject val;
	private final int constructorIndex;

	public TVector() {
		super(PoisonClass.singleton);
		this.allocator = null;
		this.i = -1;
		this.val = null;
		this.constructorIndex = 0;
		load();
	}

	public TVector(pool_allocator allocator) {
		super(PoisonClass.singleton);
		this.allocator = allocator;
		this.i = -1;
		this.val = null;
		this.constructorIndex = 1;
		load();
	}

	public TVector(int i) {
		super(PoisonClass.singleton);
		this.allocator = null;
		this.i = i;
		this.val = null;
		this.constructorIndex = 2;
		load();
	}

	public TVector(int i, PointerBoundObject val) {
		super(PoisonClass.singleton);
		this.allocator = null;
		this.i = i;
		this.val = val;
		this.constructorIndex = 3;
		load();
	}

	protected TVector(byte[] ptr) {
		super(ptr);
		this.allocator = null;
		this.i = -1;
		this.val = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TVector();
					break;
				case 1:
					ptr = Main.TVector(allocator.getPtr());
					break;
				case 2:
					ptr = Main.TVector(i);
					break;
				case 3:
					ptr = Main.TVector(i, val.getPtr());
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
				case 1:
				case 2:
				case 3:
					ptr = null;
					break;
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}
}
