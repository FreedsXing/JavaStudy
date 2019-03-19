package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFirst extends TestBase {

	/*@BeforeClass
	public static void initData() {
		System.out.println("@BeforeClass --" + Thread.currentThread().getStackTrace()[1].getClassName().substring(5) + " --" + Thread.currentThread().getStackTrace()[1].getMethodName());
	}*/
	
	@Before
	public void startServer() {
		System.out.println("@Before --" + Thread.currentThread().getStackTrace()[1].getClassName().substring(5) + " --" + Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Before
	public void start() {
		System.out.println("@Before --" + this.getClass().getSimpleName() + " --" + Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Test
	public void test11() {
		System.out.println("@Test --" + this.getClass().getSimpleName() + " --" + Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@After
	public void stop() {
		System.out.println("@After --" + this.getClass().getSimpleName() + " --" + Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@AfterClass
	public static void clearData() {
		System.out.println("@AfterClass --" + Thread.currentThread().getStackTrace()[1].getClassName().substring(5) + " --" + Thread.currentThread().getStackTrace()[1].getMethodName());

	}
}
