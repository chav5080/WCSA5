package handlingPopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleAlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///D:/Automation%20Testing/Selenium%20Data/WebElements/AlertPopUp.html");

		// generate the Alert popup
		driver.findElement(By.xpath("//button[text()='Click me!']")).click();

		// switch the controls to Alert popup
		//Thread.sleep(2000);
		Alert al = driver.switchTo().alert();

		// 1} Accept the alert Popup
		Thread.sleep(2000);
		//   al.accept();

		//   2} Dismiss the alert Popup
		al.dismiss();

		//    3} Print the Text of alert Popup
		//  System.out.println(al.getText());

		//  4} pass the characters to alert Popup
		//al.sendKeys("aaaaaa");




	}
}
