package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathActitime {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://127.0.0.1/login.do;jsessionid=15n67jkpgqtel");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	driver.findElement(By.className("sizer")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='item' and (.='Projects & Customers')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='item active']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
	//Thread.sleep(1000);
	//driver.findElement(By.name("name")).sendKeys("Amazon");
	//Thread.sleep(1000);
	//driver.findElement(By.name("createCustomerSubmit")).click();
	//Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='Create New Project']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.name("customerId")).click();
	Thread.sleep(2000);
	WebElement Single = driver.findElement(By.name("customerId"));
	Select Act = new Select(Single);
	Thread.sleep(1000);
	Act.selectByIndex(1);
	Thread.sleep(2000);
	driver.findElement(By.name("name")).sendKeys("WebApplication");
	Thread.sleep(1000);
	driver.findElement(By.name("createProjectSubmit")).click();
}
}
