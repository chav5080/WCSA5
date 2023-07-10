package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amar {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("Webdriver.chrome.driver",",/driver.chrome.driver.exe");
	WebDriver driver =  new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);
	WebElement Set = driver.findElement(By.id("search"));
	Set.sendKeys("Dhoni");
}
}
