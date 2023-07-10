package handleDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Method1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Automation%20Testing/Selenium%20Data/WebElements/MultiSelectDropDown.html");

		WebElement Multiple = driver.findElement(By.name("chkbox"));
		Select MSel = new Select(Multiple);
		Thread.sleep(2000);
		MSel.selectByValue("v2");
		//MSel.selectByIndex(8);
		//MSel.selectByVisibleText("samosa");
	}
}
