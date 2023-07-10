package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver","./driver.chromedriveer.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String facebookLpTitle=driver.getTitle();
	System.out.println("Welcome Facebook login page");
	
	}
}
