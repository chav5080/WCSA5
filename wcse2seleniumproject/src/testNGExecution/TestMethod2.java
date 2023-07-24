package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod2 {
	@Test
	public void testMethod3() {
		long threadID3 = Thread.currentThread().getId();
		Reporter.log("Thread ID of testMethod3 is :"+threadID3,true);
	}


	@Test
	public void testMethod4() {
		long threadID4 = Thread.currentThread().getId();
		Reporter.log("Thread ID of testMethod4 is :"+threadID4,true);
	}}