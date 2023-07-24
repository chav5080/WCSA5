package assignment3wcsa5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.bluestone.com");
		Thread.sleep(1000);
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(1000);
		WebElement Coin = driver.findElement(By.xpath("//a[.='Coins ']"));
		Actions Act = new Actions(driver);
		Act.moveToElement(Coin).perform();
		Thread.sleep(1000);

		

	}
}
