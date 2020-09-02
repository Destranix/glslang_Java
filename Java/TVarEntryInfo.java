package Java;

public class TVarEntryInfo extends PointerBoundObject {

	private final int id;
	private final TIntermSymbol symbol;
	private final boolean live;
	private final int newBinding;
	private final int newSet;
	private final int newLocation;
	private final int newComponent;
	private final int newIndex;
	private final EShLanguage stage;
	private final int constructorIndex;

	public TVarEntryInfo() {
		this.id = -1;
		this.symbol = null;
		this.live = false;
		this.newBinding = -1;
		this.newSet = -1;
		this.newLocation = -1;
		this.newComponent = -1;
		this.newIndex = -1;
		this.stage = null;
		this.constructorIndex = 0;
		load();
	}

	public TVarEntryInfo(int id, TIntermSymbol symbol, boolean live, int newBinding, int newSet, int newLocation,
			int newComponent, int newIndex, EShLanguage stage) {
		this.id = id;
		this.symbol = symbol;
		this.live = live;
		this.newBinding = newBinding;
		this.newSet = newSet;
		this.newLocation = newLocation;
		this.newComponent = newComponent;
		this.newIndex = newIndex;
		this.stage = stage;
		this.constructorIndex = 1;
		load();
	}

	protected TVarEntryInfo(byte[] ptr) {
		this.ptr = ptr;
		this.id = -1;
		this.symbol = null;
		this.live = false;
		this.newBinding = -1;
		this.newSet = -1;
		this.newLocation = -1;
		this.newComponent = -1;
		this.newIndex = -1;
		this.stage = null;
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TVarEntryInfo();
					break;
				case 1:
					ptr = Main.TVarEntryInfo(id, symbol.getPtr(), live, newBinding, newSet, newLocation, newComponent,
							newIndex, stage);
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

	public void setId(int v) {
		Main.TVarEntryInfo_setId(ptr, v);
	}

	public void setSymbol(TIntermSymbol v) {
		Main.TVarEntryInfo_setSymbol(ptr, v.getPtr());
	}

	public void setLive(int v) {
		Main.TVarEntryInfo_setLive(ptr, v);
	}

	public void setNewBinding(int v) {
		Main.TVarEntryInfo_setNewBinding(ptr, v);
	}

	public void setNewSet(int v) {
		Main.TVarEntryInfo_setNewSet(ptr, v);
	}

	public void setNewLocation(int v) {
		Main.TVarEntryInfo_setNewLocation(ptr, v);
	}

	public void setNewComponent(int v) {
		Main.TVarEntryInfo_setNewComponent(ptr, v);
	}

	public void setNewIndex(int v) {
		Main.TVarEntryInfo_setNewIndex(ptr, v);
	}

	public void setStage(EShLanguage v) {
		Main.TVarEntryInfo_setStage(ptr, v.getConstant());
	}

	public int getId() {
		return Main.TVarEntryInfo_getId(ptr);
	}

	public TIntermSymbol getSymbol() {
		return fromPtr(Main.TVarEntryInfo_getSymbol(ptr), TIntermSymbol.class);
	}

	public boolean getLive() {
		return Main.TVarEntryInfo_getLive(ptr);
	}

	public int getNewBinding() {
		return Main.TVarEntryInfo_getNewBinding(ptr);
	}

	public int getNewSet() {
		return Main.TVarEntryInfo_getNewSet(ptr);
	}

	public int getNewLocation() {
		return Main.TVarEntryInfo_getNewLocation(ptr);
	}

	public int getNewComponent() {
		return Main.TVarEntryInfo_getNewComponent(ptr);
	}

	public int getNewIndex() {
		return Main.TVarEntryInfo_getNewIndex(ptr);
	}

	public EShLanguage getStage() {
		return EShLanguage.valueByConstant(Main.TVarEntryInfo_getStage(ptr));
	}

	public static class TOrderById extends PointerBoundObject {

		private final int constructorIndex;

		public TOrderById() {
			this.constructorIndex = 0;
			load();
		}

		protected TOrderById(byte[] ptr) {
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
						ptr = Main.TVarEntryInfo_TOrderById();
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

		public boolean operatorCall(TVarEntryInfo l, TVarEntryInfo r) {
			return Main.TVarEntryInfo_TOrderById_operatorCall(ptr, l.getPtr(), r.getPtr());
		}

	}

	public static class TOrderByPriority extends PointerBoundObject {

		private final int constructorIndex;

		public TOrderByPriority() {
			this.constructorIndex = 0;
			load();
		}

		protected TOrderByPriority(byte[] ptr) {
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
						ptr = Main.TVarEntryInfo_TOrderByPriority();
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

		public boolean operatorCall(TVarEntryInfo l, TVarEntryInfo r) {
			return Main.TVarEntryInfo_TOrderByPriority_operatorCall(ptr, l.getPtr(), r.getPtr());
		}

	}

}
