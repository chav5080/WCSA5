package testNGAnnotation_flags;

import org.testng.annotations.Test;

public class Flag5 {
	@Test
	public void LoginMethod() 
	{
		System.out.println("It is use to perform Login..!!");
	}

	@Test(dependsOnMethods = "LoginMethod")
	public void CreateUserMethod() 
	{
		System.out.println("It is use to create User..!!");
	}

	@Test(dependsOnMethods = "CreateUserMethod")
	public void LogoutMethod() 
	{
		System.out.println("It is use to perform Logout..!!");
	}

}

