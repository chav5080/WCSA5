package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.messenger.com/");
	String Sourcecodeofmessengerpage= driver.getPageSource();
	System.out.println("Source of code messenger");
}
}
