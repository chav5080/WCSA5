package testNGAnnotation_flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	@Test(description = "Login Method")
	public void Method1() {
		Reporter.log("method from flag1");
	}

	@Test(description = "Logout Method")
	public void Method2() {
		Reporter.log("method from flag1");
	}
}
