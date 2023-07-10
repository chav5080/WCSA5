package handleDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValueMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///D:/Automation%20Testing/Selenium%20Data/WebElements/SingleSelectDropDown.html");

		WebElement dropDownElement = driver.findElement(By.id("i1"));

		Select sel = new Select(dropDownElement);

		sel.selectByValue("v8");
	}
}
