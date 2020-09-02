package com.destranix.glslang;

public class pool_allocator extends PointerBoundObject {

	private final TPoolAllocator a;
	private final pool_allocator p;
	private final int constructorIndex;

	public pool_allocator() {
		this.a = null;
		this.p = null;
		this.constructorIndex = 0;
		load();
	}

	public pool_allocator(TPoolAllocator a) {
		this.a = a;
		this.p = null;
		this.constructorIndex = 1;
		load();
	}

	public pool_allocator(pool_allocator p) {
		this.a = null;
		this.p = p;
		this.constructorIndex = 2;
		load();
	}

	protected pool_allocator(byte[] ptr) {
		this.ptr = ptr;
		this.a = null;
		this.p = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.pool_allocator();
					break;
				case 1:
					ptr = Main.pool_allocatorByTPoolAllocator(a.getPtr());
					break;
				case 2:
					ptr = Main.pool_allocator(p.getPtr());
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
					Main.delete(ptr);
					ptr = null;
					break;
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	public PointerBoundObject address(PointerBoundObject x) {
		return fromPtrUndefined(Main.pool_allocator_address(ptr, x.getPtr()));
	}

	public PointerBoundObject allocate(long n) {
		return fromPtrUndefined(Main.pool_allocator_allocate(ptr, n));
	}// NOTE: Interface not exact. size_t might be larger than long.

	public PointerBoundObject allocate(long n, byte[] ref) {
		return fromPtrUndefined(Main.pool_allocator_allocate(ptr, n, ref));
	}// NOTE: Interface not exact. size_t might be larger than long.

	public void deallocate(byte[] ref, long n) {
		Main.pool_allocator_deallocate(ptr, ref, n);
	}// NOTE: Interface not exact. size_t might be larger than long.

	public void deallocate(PointerBoundObject p, long n) {
		Main.pool_allocator_deallocate(ptr, p.getPtr(), n);
	}// NOTE: Interface not exact. size_t might be larger than long.

	public PointerBoundObject _Charalloc(long n) {
		return fromPtrUndefined(Main.pool_allocator__Charalloc(ptr, n));
	}// NOTE: Interface not exact. size_t might be larger than long.

	public void construct(PointerBoundObject p, PointerBoundObject val) {
		Main.pool_allocator_construct(ptr, p.getPtr(), val.getPtr());
	}

	public void destroy(PointerBoundObject p) {
		Main.pool_allocator_destroy(ptr, p.getPtr());
	}

	public long max_size() {
		return Main.pool_allocator_max_size(ptr);
	}// NOTE: Interface not exact. size_t might be larger than long.

	public long max_size(int size) {
		return Main.pool_allocator_max_size(ptr, size);
	}// NOTE: Interface not exact. size_t might be larger than long.

	public TPoolAllocator getAllocator() {
		return fromPtr(Main.pool_allocator_getAllocator(ptr), TPoolAllocator.class);
	}

	public boolean operatorEqual(pool_allocator rhs) {
		return Main.pool_allocator_operatorEqual(ptr, rhs.getPtr());
	}

	public boolean operatorNotEqual(pool_allocator rhs) {
		return Main.pool_allocator_operatorNotEqual(ptr, rhs.getPtr());
	}

}
