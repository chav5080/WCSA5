package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod3 {
	@Test
	public void testMethod5() {
		long threadID5 = Thread.currentThread().getId();
		Reporter.log("Thread ID of testMethod5 is :"+threadID5,true);
	}


	@Test
	public void testMethod6() {
		long threadID6 = Thread.currentThread().getId();
		Reporter.log("Thread ID of testMethod6 is :"+threadID6,true);
	}}