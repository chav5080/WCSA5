package pophandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUP {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///D:/Automation%20Testing/Selenium%20Data/WebElements/Confirmation%20PopUp.html");
	 
	// TO Genrate Confirmation PopUp Click On Submit Button 
	driver.findElement(By.xpath("//input[@type='Submit']")).click();
	
	// TO handle Confirmation By using Swtich To MEthod
	Thread.sleep(2000);
	Alert AL = driver.switchTo().alert();
	AL.accept(); // Accept 
}
}