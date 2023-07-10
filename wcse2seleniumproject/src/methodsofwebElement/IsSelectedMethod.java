package methodsofwebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver",",/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=15h508dywcyod");
		WebElement Check = driver.findElement(By.name("remember"));
		boolean Status = Check.isSelected();
		System.out.println(Status);
		Thread.sleep(2000);
		Check.click();
		boolean Status1 = Check.isSelected();
		System.out.println(Status1);
	}
}