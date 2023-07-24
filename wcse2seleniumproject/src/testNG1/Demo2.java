package testNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	@Test
	  public void method3() {
		  Reporter.log("This is a Method3",true);
	  }
	  @Test
	  public void method4() {
		  //We Create Arithmatic Exception
		  //int i =0;
		  //int j=15;
		  //int Res = j/i;
		  Reporter.log("This is a Method4",true);
	  }
}