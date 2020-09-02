package Test;

import static com.destranix.glslang.Main.*;

import java.io.IOException;
import java.util.Arrays;

import com.destranix.glslang.GlslangError;
import com.destranix.glslang.GlslangErrorMode;

public class TestSpecialFunctions {

	public static void main(String[] args) throws IOException {
		boolean callInitFuncts = true;
		if(args != null &&  Arrays.asList(args).contains("-noCallInitFuncts")){
			callInitFuncts = false;
		}
		if(callInitFuncts){
			ShInitialize();
		}
		
		
		if(!(GlslangError.valueByConstant(getLastErrorCode()) == GlslangError.GlslangErrorNone)) {throw new AssertionError("Initial value does not match excpected!");};
		
		byte[] limits = TLimits(new boolean[0]);
		delete(limits);
		
		if(!(GlslangError.valueByConstant(getLastErrorCode()) != GlslangError.GlslangErrorNone)) {throw new AssertionError("Error code not set!");};
		
		resetLastErrorCode();
		
		if(!(GlslangError.valueByConstant(getLastErrorCode()) == GlslangError.GlslangErrorNone)) {throw new AssertionError("Error code reset did not work!");};
		
		getLastErrorString();
		
		getErrorStringFromCode(GlslangError.GlslangErrorNone.getConstant());
		
		setErrorMode(GlslangErrorMode.GlslangErrorModeNone);
		
		limits = TLimits(new boolean[0]);
		delete(limits);
		
		if(!(GlslangError.valueByConstant(getLastErrorCode()) == GlslangError.GlslangErrorNone)) {throw new AssertionError("Error Mode none does not work!");};
		
		setErrorMode(GlslangErrorMode.GlslangErrorModeException);
		
		try{
			limits = TLimits(new boolean[0]);
			throw new AssertionError("Exception not thrown!");
		}catch(Throwable t){}finally{
			delete(limits);	
		}
		
		System.out.println("Test succeeded!");
		if(callInitFuncts){
			ShFinalize();
		}
	}
	
}
