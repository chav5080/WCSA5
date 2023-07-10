package assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	// Browser Operations

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize the Browser

		driver.manage().window().maximize();
		Thread.sleep(4000);

		// SetSize Of Browser

		Dimension targetSize = new Dimension(300, 450);
		driver.manage().window().setSize(targetSize);
		Thread.sleep(4000);

		//SetPosition Of Browser

		Point targetPosition = new Point(350, 350);
		driver.manage().window().setPosition(targetPosition);
		driver.close();


	}
}

