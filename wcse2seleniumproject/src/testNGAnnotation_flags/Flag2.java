package testNGAnnotation_flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	@Test(description = "Login Method",enabled = true)
	public void Method1() {
		Reporter.log("Method1 from flag2",true);
	}

	@Test(description = "Logout Method",enabled = false)
	public void Method2() {
		Reporter.log("Method2 from flag2",true);
	}


}
