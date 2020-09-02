package Java;

public class TLiveTraverser extends TIntermTraverser {

	private final TIntermediate i;
	private final boolean traverseAll;
	private final boolean preVisit;
	private final boolean inVisit;
	private final boolean postVisit;
	private final int constructorIndex;

	public TLiveTraverser(TIntermediate i) {
		super(PoisonClass.singleton);
		this.i = i;
		this.traverseAll = false;
		this.preVisit = true;
		this.inVisit = false;
		this.postVisit = false;
		this.constructorIndex = 0;
		load();
	}

	public TLiveTraverser(TIntermediate i, boolean traverseAll) {
		super(PoisonClass.singleton);
		this.i = i;
		this.traverseAll = traverseAll;
		this.preVisit = true;
		this.inVisit = false;
		this.postVisit = false;
		this.constructorIndex = 0;
		load();
	}

	public TLiveTraverser(TIntermediate i, boolean traverseAll, boolean preVisit) {
		super(PoisonClass.singleton);
		this.i = i;
		this.traverseAll = traverseAll;
		this.preVisit = preVisit;
		this.inVisit = false;
		this.postVisit = false;
		this.constructorIndex = 0;
		load();
	}

	public TLiveTraverser(TIntermediate i, boolean traverseAll, boolean preVisit, boolean inVisit) {
		super(PoisonClass.singleton);
		this.i = i;
		this.traverseAll = traverseAll;
		this.preVisit = preVisit;
		this.inVisit = inVisit;
		this.postVisit = false;
		this.constructorIndex = 0;
		load();
	}

	public TLiveTraverser(TIntermediate i, boolean traverseAll, boolean preVisit, boolean inVisit, boolean postVisit) {
		super(PoisonClass.singleton);
		this.i = i;
		this.traverseAll = traverseAll;
		this.preVisit = preVisit;
		this.inVisit = inVisit;
		this.postVisit = postVisit;
		this.constructorIndex = 0;
		load();
	}

	protected TLiveTraverser(byte[] ptr) {
		super(ptr);
		this.i = null;
		this.traverseAll = false;
		this.preVisit = false;
		this.inVisit = false;
		this.postVisit = false;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TLiveTraverser(i.getPtr(), traverseAll, preVisit, inVisit, postVisit);
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

	public void pushFunction(String name) {
		Main.TLiveTraverser_pushFunction(ptr, name);
	}

	public void pushGlobalReference(String name) {
		Main.TLiveTraverser_pushGlobalReference(ptr, name);
	}

	public void setDestinations(CList<TIntermAggregate> v) {
		Main.TLiveTraverser_setDestinations(ptr, v.getPtr());
	}

	public CList<TIntermAggregate> getDestinations() {
		@SuppressWarnings("unchecked") // Is checked
		CList<TIntermAggregate> tmp = (CList<TIntermAggregate>) fromPtr(Main.TLiveTraverser_getDestinations(ptr),
				CList.class);
		return tmp;
	}

}
