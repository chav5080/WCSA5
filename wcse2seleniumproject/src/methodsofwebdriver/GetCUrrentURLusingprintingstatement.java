package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCUrrentURLusingprintingstatement {
	public static void main(String[] args) {
		System.setProperty("Webdriver.driver.chrome","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getCurrentUrl());
		}
}