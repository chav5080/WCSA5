package testNGAnnotation_flags;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Flag7 {
	@Test
	public void LoginMethod() 
	{
		System.out.println("It is use to perform Login..!!");
	}

	@Test(dependsOnMethods = "LoginMethod")
	public void CreateUserMethod() 
	{
		Assert.fail();
		System.out.println("It is use to create User..!!");
	}

	@Test(dependsOnMethods = "CreateUserMethod",alwaysRun = true)
	public void LogoutMethod() 
	{
		
		System.out.println("It is use to perform Logout..!!");
	}

}
