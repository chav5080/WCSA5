package assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfPoha {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("Poha");
		Thread.sleep(1000);
		List<WebElement> ListP = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
		//List<WebElement> ListP = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
		for(int p=0;p>ListP.size();p++)

		{ WebElement Tally = ListP.get(p);
		String Count = Tally.getText();
		Thread.sleep(1000);
		System.out.println("Count");
		Thread.sleep(1000);

		}
	}
}
