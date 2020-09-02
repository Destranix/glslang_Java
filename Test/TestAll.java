package Test;

import static Java.Main.FinalizeProcess;
import static Java.Main.InitializeProcess;

import java.io.IOException;

public class TestAll {
	public static void main(String[] args) throws IOException {
		String[] testArgs = new String[]{
				"-noCallInitFuncts", 
				"-noDestruct"//Destruction leads to bad allocation in following tests. No further investigation since C-API is deprecated anyway
				};
		InitializeProcess();
		TestCompileOpenGlHLSL.main(testArgs);
		TestCompileVulkanGLSL.main(testArgs);
		TestMultithreadErrorCode.main(testArgs);
		TestPureC.main(testArgs);
		TestSpecialConstellationsAndStructures.main(testArgs);
		TestSpecialFunctions.main(testArgs);
		FinalizeProcess();
	}
}
