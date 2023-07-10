package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shine.com/registration/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'id_name')]")).sendKeys("Atul");
		Thread.sleep(2000);
		driver.findElement(By.id("id_email")).sendKeys("atul@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'id_cell_phone')]")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'id_password')]")).sendKeys("atul123");
		Thread.sleep(2000);
		driver.findElement(By.id("registerButton")).click();
	}
}
