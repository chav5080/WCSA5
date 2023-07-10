package synchronaiztion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchActitime1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=bldals46g38kl");
		String LPTitle = driver.getTitle();
		if(LPTitle.equals("actiTIME - Login"))
		{System.out.println("Welcome Login Page Actitime");
		}
		else 
		{ System.out.println("Not Welcome Login Page Actitime");
		}
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);

		String HPTitle = driver.getTitle();
		if(HPTitle.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Welcome Enter Time Track");
		}
		else 
		{
			System.out.println("Not Welcome Enter Time Track ");
		}
	}
}