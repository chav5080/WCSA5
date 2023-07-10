package assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import methodsofwebElement.IsDisplayedMethod;

public class Bluestone {
	private static final char[] IsDisplayedMethod = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Offers ']")).click();
		Thread.sleep(1000);
		WebElement Test = driver.findElement(By.xpath("//span[.='Offers'][1]"));
		Actions Act = new Actions(driver);
		Act.moveToElement(Test).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='(3969)']")).click();
		Thread.sleep(1000);
		WebElement Check = driver.findElement(By.xpath("//span[.='10% Making Charge Off']"));
		boolean Prnt = Check.isDisplayed();
		System.out.println(Prnt);
		driver.close();



	}
}
