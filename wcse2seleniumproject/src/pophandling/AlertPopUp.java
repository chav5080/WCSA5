package pophandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
public static void main(String[] args) throws AWTException {
	System.setProperty("driver.chrome.driver","./driver.chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///D:/Automation%20Testing/Selenium%20Data/WebElements/AlertPopUp.html");
	
	// TO genrate Pop Up Click On Button 
	driver.findElement(By.xpath("//button[@type='button']")).click();
	
	// Handle Pop Up by using Robot Class...
	
	Robot Robot = new Robot();
	Robot.keyPress(KeyEvent.VK_ENTER);
	Robot.keyRelease(KeyEvent.VK_ENTER);
	
}
}
