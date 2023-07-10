package handlingPopUp;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActimeFileUplload {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.do;jsessionid=wy4ni3xfap38");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("//div[.='Settings']/following-sibling::img")).click();
		WebElement target = driver.findElement(By.partialLinkText("Logo & Color Scheme"));

		Actions act = new Actions(driver);
		// mouserHover Action
		act.moveToElement(target).perform();
		target.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();

		WebElement target2 = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		//DoubleClick Action
		// FileUploadPopUp 
		act.doubleClick(target2).perform();

		// Handle FileUploadPopUp

		Runtime.getRuntime().exec("./autoitPrograms/OmayoFileUpload.exe");
		
		Thread.sleep(1000);
		WebElement target3 = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		//DoubleClick Action
		// FileUploadPopUp 
		act.doubleClick(target3).perform();

		// Handle FileUploadPopUp

		Runtime.getRuntime().exec("./autoitPrograms/OmayoFileUpload.exe");
		
	
	}
}
