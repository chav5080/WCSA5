package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("Webdriver.chrome.driver",",/drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(1000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	Thread.sleep(1000);
	driver.findElement(By.name("password")).sendKeys("admin123");
	Thread.sleep(1000);
	driver.findElement(By.tagName("button")).click();
	
}
}
