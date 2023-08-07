package testNG1;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseTest {

	static WebDriver driver;
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=2lmdlxctpfh0n");
	}

	// implementation of takes Screenshot

	public void FailedMethod(String methodName)
	{
		TakesScreenshot TS = (TakesScreenshot)driver;
		File SRC = TS.getScreenshotAs(OutputType.FILE);
		File DSC = new File("./ScreenShots/"+methodName+"png");
	}

	public void TearDown()
	{
		driver.quit();
	}
}
