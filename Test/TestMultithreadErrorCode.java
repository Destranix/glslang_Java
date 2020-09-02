package Test;

import static Java.Main.ShFinalize;
import static Java.Main.ShInitialize;
import static Java.Main.TLimits;
import static Java.Main.delete;
import static Java.Main.getLastErrorCode;

import java.io.IOException;
import java.util.Arrays;

public class TestMultithreadErrorCode {

	public static final boolean[] defaultTLimitsValues = {
			/* .nonInductiveForLoops = */ true,
	        /* .whileLoops = */ true,
	        /* .doWhileLoops = */ true,
	        /* .generalUniformIndexing = */ true,
	        /* .generalAttributeMatrixVectorIndexing = */ true,
	        /* .generalVaryingIndexing = */ true,
	        /* .generalSamplerIndexing = */ true,
	        /* .generalVariableIndexing = */ true,
	        /* .generalConstantMatrixVectorIndexing = */ true
	};
	
	public static final Object lock1 = new Object();
	public static final Object lock2 = new Object();
	public static final Object lock3 = new Object();
	public static volatile boolean condition1 = false;
	public static volatile boolean condition2 = false;
	public static volatile boolean condition3 = false;
	public static volatile int errorCode1 = -1;
	public static volatile int errorCode2 = -1;
	
	public static void main(String[] args) throws IOException {
		boolean callInitFuncts = true;
		if(args != null &&  Arrays.asList(args).contains("-noCallInitFuncts")){
			callInitFuncts = false;
		}
		if(callInitFuncts){
			ShInitialize();
		}

		
		Thread t2 = new Thread(){

			@Override
			public void run() {
				//Wait for start of first thread
				synchronized(lock1){
					condition1 = true;
					lock1.notifyAll();
				}
				synchronized(lock2){
					while(!condition2){
						try {
							lock2.wait();
						} catch (InterruptedException e) {}
					}
				}
				
				//Wait for first thread to cause error
				synchronized(lock3){
					while(!condition3){
						try {
							lock3.wait();
						} catch (InterruptedException e) {}
					}
				}
				
				errorCode2 = getLastErrorCode();
			}
			
		};
		
		Thread t1 = new Thread(){

			@Override
			public void run() {
				//Wait for start of second thread
				synchronized(lock2){
					condition2 = true;
					lock2.notifyAll();
				}
				synchronized(lock1){
					while(!condition1){
						try {
							lock1.wait();
						} catch (InterruptedException e) {}
					}
				}
				
				//Cause error
				byte[] limits = TLimits(new boolean[0]);
				delete(limits);
				errorCode1 = getLastErrorCode();
				
				synchronized(lock3){
					condition3 = true;
					lock3.notifyAll();
				}
				
				//Wait for second thread to finish
				try {
					t2.join();
				} catch (InterruptedException e) {}
			}
			
		};
		
		t1.start();
		t2.start();
		while(t1.isAlive() || t2.isAlive()){
			try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {}
		}
		if(errorCode1 == errorCode2){
			System.out.println("Error code implementation is not thread-safe!");
		}else{
			System.out.println("Error code implementation is thread-safe!");
		}
		
		if(callInitFuncts){
			ShFinalize();
		}
	}
	
}
