package operationalmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Automation%20Testing/Selenium%20Data/WebElements/SingleSelectDropDown.html");
		WebElement SingleDropdown = driver.findElement(By.id("i1"));
		Select Sel = new Select(SingleDropdown);
		boolean Check = Sel.isMultiple();    //Operational Method
		System.out.println(Check);
		Thread.sleep(2000);
		driver.navigate().to("file:///D:/Automation%20Testing/Selenium%20Data/WebElements/MultiSelectDropDown.html");
		WebElement SingleDropdown1 = driver.findElement(By.name("chkbox"));
		Select Sel1 = new Select(SingleDropdown1);
		boolean Check1 = Sel1.isMultiple();
		System.out.println(Check1);
		
	}
}
