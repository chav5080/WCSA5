package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod1 {
	@Test
	public void testMethod1() {
		long threadID1 = Thread.currentThread().getId();
		Reporter.log("Thread ID of testMethod1 is :"+threadID1,true);
	}


	@Test
	public void testMethod2() {
		long threadID2 = Thread.currentThread().getId();
		Reporter.log("Thread ID of testMethod2 is :"+threadID2,true);
	}}