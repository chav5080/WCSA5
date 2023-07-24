package testNG;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void Method1() throws InterruptedException 
	{
		//System.out.println("This is a Demo Class..!!");
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
		Thread.sleep(1000);
		driver.quit();
		Reporter.log("This is a Demo Class..!!", true);
	}
}
