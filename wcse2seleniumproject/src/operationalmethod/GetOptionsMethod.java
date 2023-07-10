package operationalmethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Automation%20Testing/Selenium%20Data/WebElements/SingleSelectDropDown.html");
		WebElement SingleDropdown = driver.findElement(By.id("i1"));
		Select Sel = new Select(SingleDropdown);
		boolean Check = Sel.isMultiple();
		System.out.println(Check);
		List<WebElement> Check1 = Sel.getOptions();
		for (int a=0;a<Check1.size();a++)
		{
			WebElement Get = Check1.get(a);
			String Allopt = Get.getText();
			System.out.println(Allopt);
			Thread.sleep(1000);
		}
		driver.navigate().to("file:///D:/Automation%20Testing/Selenium%20Data/WebElements/MultiSelectDropDown.html");
		WebElement MultiSelect = driver.findElement(By.name("chkbox"));
		Select Sel1 = new Select(MultiSelect);
		boolean Checking = Sel1.isMultiple();
		System.out.println(Checking);
		List<WebElement> Checking1 = Sel1.getOptions();
		for (int b = 0;b<Checking1.size();b++)
		{
			WebElement Confirm = Checking1.get(b);
			String AllOpt1 = Confirm.getText();
			System.out.println(AllOpt1);
			Thread.sleep(1000);

		}

	}
}
