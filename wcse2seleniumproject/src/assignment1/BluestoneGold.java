package assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneGold {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.bluestone.com/");
	Thread.sleep(1000);
	driver.findElement(By.id("denyBtn")).click();
	Thread.sleep(1000);
	WebElement Coin = driver.findElement(By.xpath("//a[.='Coins ']"));
    Actions Act = new Actions(driver);
    Act.moveToElement(Coin).build().perform();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//span[.='2 gram' and @data-p='gold-coins-weight-2gms,m']")).click();
    Thread.sleep(1000);
    WebElement Check = driver.findElement(By.xpath("//h1[.='2 gram 24 KT Gold Coin']"));
    boolean Print = Check.isDisplayed();
    System.out.println(Print);
    driver.close();
}
}
