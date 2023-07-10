package methodsofwebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		WebElement Value = driver.findElement(By.xpath("(//div[contains(@class,'card-header bg-transparent border-0 text-center py-0')])[5]"));
		String Font = Value.getCssValue("font-family");
		System.out.println(Font);
	}
}