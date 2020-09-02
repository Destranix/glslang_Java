package Java;

public class TCrackedTextureOp extends PointerBoundObject {

	private final boolean query;
	private final boolean proj;
	private final boolean lod;
	private final boolean fetch;
	private final boolean offset;
	private final boolean offsets;
	private final boolean gather;
	private final boolean grad;
	private final boolean subpass;
	private final boolean lodClamp;
	private final boolean fragMask;
	private final int constructorIndex;

	public TCrackedTextureOp() {
		this.query = false;
		this.proj = false;
		this.lod = false;
		this.fetch = false;
		this.offset = false;
		this.offsets = false;
		this.gather = false;
		this.grad = false;
		this.subpass = false;
		this.lodClamp = false;
		this.fragMask = false;
		this.constructorIndex = 0;
		load();
	}

	public TCrackedTextureOp(boolean query, boolean proj, boolean lod, boolean fetch, boolean offset, boolean offsets,
			boolean gather, boolean grad, boolean subpass, boolean lodClamp, boolean fragMask) {
		this.query = query;
		this.proj = proj;
		this.lod = lod;
		this.fetch = fetch;
		this.offset = offset;
		this.offsets = offsets;
		this.gather = gather;
		this.grad = grad;
		this.subpass = subpass;
		this.lodClamp = lodClamp;
		this.fragMask = fragMask;
		this.constructorIndex = 1;
		load();
	}

	protected TCrackedTextureOp(byte[] ptr) {
		this.ptr = ptr;
		this.query = false;
		this.proj = false;
		this.lod = false;
		this.fetch = false;
		this.offset = false;
		this.offsets = false;
		this.gather = false;
		this.grad = false;
		this.subpass = false;
		this.lodClamp = false;
		this.fragMask = false;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TCrackedTextureOp();
					break;
				case 1:
					ptr = Main.TCrackedTextureOp(query, proj, lod, fetch, offset, offsets, gather, grad, subpass,
							lodClamp, fragMask);
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
					Main.delete(ptr);
					ptr = null;
					break;
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	public void setQuery(boolean v) {
		Main.TCrackedTextureOp_setQuery(ptr, v);
	}

	public void setProj(boolean v) {
		Main.TCrackedTextureOp_setProj(ptr, v);
	}

	public void setLod(boolean v) {
		Main.TCrackedTextureOp_setLod(ptr, v);
	}

	public void setFetch(boolean v) {
		Main.TCrackedTextureOp_setFetch(ptr, v);
	}

	public void setOffset(boolean v) {
		Main.TCrackedTextureOp_setOffset(ptr, v);
	}

	public void setOffsets(boolean v) {
		Main.TCrackedTextureOp_setOffsets(ptr, v);
	}

	public void setGather(boolean v) {
		Main.TCrackedTextureOp_setGather(ptr, v);
	}

	public void setGrad(boolean v) {
		Main.TCrackedTextureOp_setGrad(ptr, v);
	}

	public void setSubpass(boolean v) {
		Main.TCrackedTextureOp_setSubpass(ptr, v);
	}

	public void setLodClamp(boolean v) {
		Main.TCrackedTextureOp_setLodClamp(ptr, v);
	}

	public void setFragMask(boolean v) {
		Main.TCrackedTextureOp_setFragMask(ptr, v);
	}

	public boolean getQuery() {
		return Main.TCrackedTextureOp_getQuery(ptr);
	}

	public boolean getProj() {
		return Main.TCrackedTextureOp_getProj(ptr);
	}

	public boolean getLod() {
		return Main.TCrackedTextureOp_getLod(ptr);
	}

	public boolean getFetch() {
		return Main.TCrackedTextureOp_getFetch(ptr);
	}

	public boolean getOffset() {
		return Main.TCrackedTextureOp_getOffset(ptr);
	}

	public boolean getOffsets() {
		return Main.TCrackedTextureOp_getOffsets(ptr);
	}

	public boolean getGather() {
		return Main.TCrackedTextureOp_getGather(ptr);
	}

	public boolean getGrad() {
		return Main.TCrackedTextureOp_getGrad(ptr);
	}

	public boolean getSubpass() {
		return Main.TCrackedTextureOp_getSubpass(ptr);
	}

	public boolean getLodClamp() {
		return Main.TCrackedTextureOp_getLodClamp(ptr);
	}

	public boolean getFragMask() {
		return Main.TCrackedTextureOp_getFragMask(ptr);
	}

}
