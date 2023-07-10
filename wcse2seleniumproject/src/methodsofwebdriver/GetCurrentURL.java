package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {
public static void main(String[] args) {
	System.setProperty("Webdriver.driver.chrome","./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.youtube.com/");
	String GetCurrentURL= driver.getCurrentUrl();
	
	
	
}
}
