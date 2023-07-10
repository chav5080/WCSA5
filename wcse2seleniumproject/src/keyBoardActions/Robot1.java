package keyBoardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot1 {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("Webdriver.chrome.driver","./drivers/chromedrive.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.calculator.net/");
	Thread.sleep(2000);
	
	//TO ACCESS METHOD OF KEYBOARD CREATE OF ROBOT CLASS
	
	Robot robot = new Robot();
	
	//GENRATE PRINT 
	robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_P);
    
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyRelease(KeyEvent.VK_P);
}
}
