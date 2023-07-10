package assignment3wcsa5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BluestoneFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		//Handle Hidden Division PopUp
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		Thread.sleep(2000);
		
		//Switch the Controls to Frame 
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		driver.switchTo().frame(frameElement);
		//Thread.sleep(2000);
		
		
		driver.findElement(By.id("chat-icon")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("chat-fc-name")).sendKeys("Atul");
		Thread.sleep(1000);
		driver.findElement(By.id("chat-fc-email")).sendKeys("Atul@3434");
		Thread.sleep(1000);
		driver.findElement(By.id("chat-fc-phone")).sendKeys("1234567890");
		
		
}

}
