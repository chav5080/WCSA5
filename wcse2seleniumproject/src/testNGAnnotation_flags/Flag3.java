package testNGAnnotation_flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
  @Test(invocationCount = 500)
  public void Method1() {
	  Reporter.log("Method1", true);
  }
}
