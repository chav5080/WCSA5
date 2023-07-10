package operationalmethod;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {



	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Automation%20Testing/Selenium%20Data/WebElements/SingleSelectDropDown.html");
		WebElement SingleDropdown = driver.findElement(By.id("i1"));
		Select Sel = new Select(SingleDropdown);
		// Without using selection method select the option from dropdown
		List<WebElement> AllOPT = Sel.getOptions();
		Thread.sleep(2000);
		for(WebElement option:AllOPT)
		{
			if(option.getText().equals("shira"))
			{
				option.click();
				break;
			}
		}
	}
}
