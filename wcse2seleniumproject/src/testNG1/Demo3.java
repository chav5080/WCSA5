package testNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
	@Test
	  public void method5() {
		  Reporter.log("This is a Method5",true);
	  }
	  @Test
	  public void method6() {
		  Reporter.log("This is a Method6",true);
	  }
}