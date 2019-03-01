package test;

import org.junit.Before;
import org.junit.Test;

public class TestFirst extends TestBase {

	@Before
	public void startServer() {
		System.out.println(" --" + Thread.currentThread().getStackTrace()[1].getClassName() + " --" + Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Before
	public void start() {
		System.out.println(" --" + Thread.currentThread().getStackTrace()[1].getClassName() + " --" + Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Test
	public void test11() {
		System.out.println(" --" + this.getClass().getSimpleName() + " --" + Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
}
