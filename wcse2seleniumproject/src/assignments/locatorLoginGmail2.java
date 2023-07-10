package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorLoginGmail2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&ifkv=AWnogHe3ZHDetPxd8qrSZfWcE1Iu5YXv3v-uz0tgVuzVaX0OSLqbPyO1S2AmSUeL2g1S2j8TT80SNA&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(3000);
		driver.findElement(By.tagName("input")).sendKeys("Admin");
	}
}