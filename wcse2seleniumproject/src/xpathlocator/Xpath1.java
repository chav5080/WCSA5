package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nike.com/in/member/profile/login?continueUrl=https://www.nike.com/in/");
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("atul@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234567");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='c4c1352b-766a-4e9a-8e09-2e0824c50948']")).click();
		driver.close();
	}
}
