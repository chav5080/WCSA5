package actionsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=EAIaIQobChMI08j3_vO__QIVUCQrCh1xkgi4EAAYASAAEgJDevD_BwE");
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();

		WebElement Test = driver.findElement(By.xpath("//a[contains(.,'Watch Jewellery ')]"));

		Actions act = new Actions(driver);

		act.moveToElement(Test).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Band']")).click();
	}
}
