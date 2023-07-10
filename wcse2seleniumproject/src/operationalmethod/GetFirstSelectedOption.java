package operationalmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","./drivers.chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///D:/Automation%20Testing/Selenium%20Data/WebElements/MultiSelectDropDown.html");
		WebElement DropdownElement = driver.findElement(By.id("i1"));
		Select Sel = new Select(DropdownElement);
		for(int a=0;a<5;a++)
		{
			Sel.selectByIndex(a);

		}
		WebElement Value = Sel.getFirstSelectedOption();
		String Text = Value.getText();
		System.out.println(Text);
}
}