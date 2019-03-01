package test;

import org.junit.Before;

public class TestBase {

	@Before
	public void startServer() {
		System.out.println(" --" + Thread.currentThread().getStackTrace()[1].getClassName() + " --" + Thread.currentThread().getStackTrace()[1].getMethodName());
	}
}
