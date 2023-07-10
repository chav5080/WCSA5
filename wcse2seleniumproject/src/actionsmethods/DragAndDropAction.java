package actionsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedrive.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(3000);
		WebElement SRC1 = driver.findElement(By.xpath("//a[.=' BANK ']"));
		WebElement Target1 = driver.findElement(By.xpath("//div[@id='shoppingCart1']/descendant::li"));

		Actions Act1 = new Actions(driver);
		Act1.dragAndDrop(SRC1, Target1).perform();
		Thread.sleep(1000);
		
		WebElement SRC = driver.findElement(By.xpath("//a[.=' 5000']"));
		WebElement Target = driver.findElement(By.xpath("(//div[@id='shoppingCart4']/descendant::li)[1]"));
		Actions Act = new Actions(driver);

		Act.dragAndDrop(SRC, Target).perform();
	}
}
