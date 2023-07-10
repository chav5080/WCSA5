package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Automation%20Testing/Selenium%20Data/WebElements/Username.html");
		driver.findElement(By.id("i1")).sendKeys("Manager");
		Thread.sleep(3000);
		driver.navigate().to("file:///D:/Automation%20Testing/Selenium%20Data/WebElements/Password%20TextBox.html");
		driver.findElement(By.id("i1")).sendKeys("Admin");
	}
}