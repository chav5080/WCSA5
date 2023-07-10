package handleDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowntypes {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Automation%20Testing/Selenium%20Data/WebElements/MultiSelectDropDown.html");
		Thread.sleep(1000);
		WebElement Dropdown = driver.findElement(By.id("i1"));
		Select Sel = new Select(Dropdown);
		// Select By Index
		Sel.selectByIndex(1);
		Thread.sleep(1000);
		// Select By Visible Text
		Sel.selectByVisibleText("vadapav");
		Thread.sleep(1000);
		// Select By Value 
		Sel.selectByValue("v4");
		Thread.sleep(1000);
		//Deselect By Index
		Sel.deselectByIndex(3);
		Thread.sleep(1000);
		//Deselect By Visible Text
		Sel.deselectByVisibleText("idli");
		Thread.sleep(1000);
		//Deselect By Value
		Sel.deselectByValue("v3");

		// To Select Multiple options using For Loop

		for(int i=0;i<5;i++)
		{
			Sel.selectByIndex(i);
			Thread.sleep(1000);
		}

		// To Deselect Multiple Options Using For Loop

		for(int i =0;i<5;i++)
		{
			Sel.deselectByIndex(i);
			Thread.sleep(1000);
		}

		// Deselect All
		 Sel.deselectAll();
	}
}