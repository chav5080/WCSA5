package testNGAnnotation_flags;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearchTestCase extends BaseTest {
	@Test
	public void Search1() throws InterruptedException {
		driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void Search2() throws InterruptedException {
		driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
		Thread.sleep(1000);
		driver.close();
	}

	@Test
	public void Search3() throws InterruptedException {
		driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
		Thread.sleep(1000);
		driver.close();
	}
}
