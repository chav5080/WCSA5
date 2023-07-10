package methodsofwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys("iphone");

		List<WebElement> List = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
		for (int a=0;a<List.size();a++)
		{WebElement Total = List.get(a);
		String iphone = Total.getText();
		System.out.println(iphone);
		Thread.sleep(1000);
		}
	}
}
