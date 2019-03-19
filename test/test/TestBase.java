package test;

import org.junit.Before;

public class TestBase {

	@Before
	public void startServer() {
		System.out.println("@Before --" + Thread.currentThread().getStackTrace()[1].getClassName().substring(5) + " --" + Thread.currentThread().getStackTrace()[1].getMethodName());
	}
}
