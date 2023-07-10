package assignment1;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicates1 {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver","./drivers.chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///D:/Automation%20Testing/Selenium%20Data/WebElements/MultiSelectDropDown.html");
	WebElement DropDownElement = driver.findElement(By.id("i1"));
	Select Sel = new Select(DropDownElement);
	HashSet<String> HS = new HashSet<String>();
	//get the List Of WEBELEMENT
	List<WebElement> Allopt = Sel.getOptions();
	// READ THE LIST & GET THE TEXT
	for(int a=0;a<Allopt.size();a++)
	{
		WebElement Options = Allopt.get(a);
		String Text = Options.getText();
	// ADD THE TEXT TO SET SO THAT DUPLICATE WON'T BE ACCEPTED AND 
		// INSERTION ORDER IS WON'T BE MAINTAINED
		HS.add(Text);
	}
	//READ THE SET
	
}

}
