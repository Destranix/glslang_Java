package Java;

public class TIntermNodePair extends PointerBoundObject {

	private final TIntermNode node1;
	private final TIntermNode node2;
	private final int constructorIndex;

	public TIntermNodePair() {
		this.node1 = null;
		this.node2 = null;
		this.constructorIndex = 0;
		load();
	}

	public TIntermNodePair(TIntermNode node1, TIntermNode node2) {
		this.node1 = node1;
		this.node2 = node2;
		this.constructorIndex = 1;
		load();
	}

	protected TIntermNodePair(byte[] ptr) {
		this.ptr = ptr;
		this.node1 = null;
		this.node2 = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TIntermNodePair();
					break;
				case 1:
					ptr = Main.TIntermNodePair(node1.getPtr(), node2.getPtr());
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

	public void setNode1(TIntermNode v) {
		Main.TIntermNodePair_setNode1(ptr, v.getPtr());
	}

	public void setNode2(TIntermNode v) {
		Main.TIntermNodePair_setNode2(ptr, v.getPtr());
	}

	public TIntermNode getNode1() {
		return fromPtr(Main.TIntermNodePair_getNode1(ptr), TIntermNode.class);
	}

	public TIntermNode getNode2() {
		return fromPtr(Main.TIntermNodePair_getNode2(ptr), TIntermNode.class);
	}

}
