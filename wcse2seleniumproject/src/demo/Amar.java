package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amar {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.google.com/");
driver.switchTo().activeElement().sendKeys("Deepika padukon",Keys.ENTER);
Thread.sleep(2000);


}}
