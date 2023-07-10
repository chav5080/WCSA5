package assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathIRCTC {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-8')]")).sendKeys("Pune");
		driver.findElement(By.xpath("//span[contains(text(),'PUNE JN - PUNE')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-9')]")).sendKeys("mumbai");
		driver.findElement(By.xpath("//span[contains(@class,'ng-tns-c57-9 ng-star-inserted')and (text()='MUMBAI CENTRAL - MMCT')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c58-10 ui')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'12')]")).click();
	}
}
