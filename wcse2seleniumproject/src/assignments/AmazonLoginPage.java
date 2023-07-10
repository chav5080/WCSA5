package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-account%3Fref_%3Dnav_signin&prevRID=HMB4RQWR3CN3PYDQ5QJ8&openid.assoc_handle=inflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(1000);
		driver.findElement(By.id("ap_customer_name")).sendKeys("Atul");
		Thread.sleep(1000);
		driver.findElement(By.id("ap_phone_number")).sendKeys("1234567890");
		Thread.sleep(1000);
		driver.findElement(By.id("ap_email")).sendKeys("abc@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("ap_password")).sendKeys("abcdefg");
		Thread.sleep(1000);
		driver.findElement(By.id("continue")).click();

	}
}
