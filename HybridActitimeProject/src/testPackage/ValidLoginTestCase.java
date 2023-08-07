package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.LoginPage;

public class ValidLoginTestCase extends BaseTest {

	@Test
	public void loginMethod() throws IOException
	{
		// To perform login call the methods from login page (POM) class
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		lp.validLoginMethod(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));
	}

	@Test
	public void InValidLoginMethod()
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();

	}
}
