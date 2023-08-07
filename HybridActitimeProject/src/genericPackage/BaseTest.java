package genericPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;import javax.print.attribute.standard.Destination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseTest implements IautoConstand {

	protected  static WebDriver driver;

	@BeforeMethod
	public void setUp() throws IOException
	{
		Flib Flib = new Flib();
		String browserValue = Flib.readPropertyData(PROP_PATH,"Browser");
		String Url = Flib.readPropertyData(PROP_PATH, "Url");

		if(browserValue.equalsIgnoreCase("chrome"))

		{
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver=new ChromeDriver();	
		}

		else if(browserValue.equalsIgnoreCase("edge"))
		{
			System.setProperty(EDGE_KEY,EDGE_PATH);
			driver=new EdgeDriver();
		}
		else
		{
			Reporter.log("BrowserValue is InValid",true);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(Url);

	}
	public void FailedMethod (String methodName)
	{
		TakesScreenshot TS = (TakesScreenshot)driver;
		File SRC = TS.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/"+methodName+".png");

		try
		{
			Files.copy(SRC, dest);
		}
		catch(Exception e) {
		}
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}