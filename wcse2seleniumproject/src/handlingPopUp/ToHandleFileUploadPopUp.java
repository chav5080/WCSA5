package handlingPopUp;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopUp {
	public static void main(String[] args) throws IOException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://omayo.blogspot.com/");
		Actions Act = new Actions(driver);

		WebElement Target = driver.findElement(By.id("uploadfile"));
		Act.doubleClick(Target).perform();
		Runtime.getRuntime().exec("./autoitPrograms/OmayoFileUpload.exe");
	}
}