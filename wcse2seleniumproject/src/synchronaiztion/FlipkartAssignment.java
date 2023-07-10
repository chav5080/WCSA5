package synchronaiztion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Log']")).click();
		// Thread.sleep(2000);
		// driver.quit();
		
	}

}

