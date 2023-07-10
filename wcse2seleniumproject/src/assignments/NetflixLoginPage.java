package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver",",/drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(1000);
		driver.findElement(By.id("id_userLoginId")).sendKeys("abcd123@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("id_password")).sendKeys("987654321A");
		Thread.sleep(1000);
		driver.findElement(By.tagName("button")).click();

		// sign in not successfully because of too many tagName are same 
	}
}
