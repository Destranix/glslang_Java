package Java;

public class TBuiltIns extends TBuiltInParseables {

	private final int constructorIndex;

	public TBuiltIns() {
		super(PoisonClass.singleton);
		this.constructorIndex = 0;
		load();
	}

	protected TBuiltIns(byte[] ptr) {
		super(ptr);
		this.constructorIndex = -1;
	}

	@Override
	protected void load_intern() {
		if (ptr == null) {
			switch (constructorIndex) {
				case -1:
					throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
				case 0:
					ptr = Main.TBuiltIns();
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
					ptr = null;
					break;
				default:
					throw new AssertionError("Reached unreachable state!");
			}
		}
	}

	@Override
	public void initialize(int version, EProfile profile, SpvVersionStruct spvVersion) {
		Main.TBuiltIns_initialize(ptr, version, profile, spvVersion.getPtr());
	}

	@Override
	public void initialize(TBuiltInResource resources, int version, EProfile profile, SpvVersionStruct spvVersion,
			EShLanguage language) {
		Main.TBuiltIns_initialize(ptr, resources.getPtr(), version, profile, spvVersion.getPtr(), language);
	}

	@Override
	public void identifyBuiltIns(int version, EProfile profile, SpvVersionStruct spvVersion, EShLanguage language,
			TSymbolTable symbolTable) {
		Main.TBuiltIns_identifyBuiltIns(ptr, version, profile, spvVersion.getPtr(), language, symbolTable.getPtr());
	}

	@Override
	public void identifyBuiltIns(int version, EProfile profile, SpvVersionStruct spvVersion, EShLanguage language,
			TSymbolTable symbolTable, TBuiltInResource resources) {
		Main.TBuiltIns_identifyBuiltIns(ptr, version, profile, spvVersion.getPtr(), language, symbolTable.getPtr(),
				resources.getPtr());
	}

}
