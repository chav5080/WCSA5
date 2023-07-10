package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFlipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop",Keys.ENTER);
		//optional path driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (text()='Processor')]")).click();
		
        driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i5')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (text()='Brand')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='HP']/preceding-sibling::div[@class='_24_Dny']")).click();		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[text()='4★ & above']/preceding-sibling::div")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[ contains(text(),'15s- fr4000TU')]")).click();
		Thread.sleep(5000);

		//driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']")).sendKeys("411040",Keys.ENTER);
		
		
	}
}
