package handleDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Method2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Automation%20Testing/Selenium%20Data/WebElements/MultiSelectDropDown.html");
		WebElement dropDownElement = driver.findElement(By.name("chkbox"));
		Select Sel = new Select(dropDownElement);
		for (int a=0;a<9;a++)
		{Sel.selectByIndex(a);
		Thread.sleep(2000);
		}
	}
}
