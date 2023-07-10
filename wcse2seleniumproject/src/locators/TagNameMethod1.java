package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameMethod1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Automation%20Testing/Selenium%20Data/WebElements/TextBox.html");
		Thread.sleep(3000);
		driver.findElement(By.tagName("input")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.navigate().to("file:///D:/Automation%20Testing/Selenium%20Data/WebElements/SingleSelectDropDown.html");
		driver.findElement(By.tagName("select")).click();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.tagName("input")).sendKeys("Admin");
	}
}