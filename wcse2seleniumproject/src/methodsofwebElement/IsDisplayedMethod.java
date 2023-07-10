package methodsofwebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("Webdriver.chrome.driver","./drivers.chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.selenium.dev/downloads/");
	Thread.sleep(3000);
	WebElement Down = driver.findElement(By.xpath("//h1[.='Downloads']"));
	boolean Check = Down.isDisplayed();
	System.out.println(Check);
}
}
