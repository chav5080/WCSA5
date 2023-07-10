package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeClearandSendKeys {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=66h2k3fh2sblj");
		Thread.sleep(1000);
		WebElement Ename = driver.findElement(By.name("username"));
		Ename.sendKeys("admin");
		Thread.sleep(1000);
		WebElement Epass = driver.findElement(By.name("pwd"));
		Epass.sendKeys("manager");
		Thread.sleep(2000);
		Ename.clear();
		Thread.sleep(1000);
		Epass.clear();
		driver.quit();
	}
}
