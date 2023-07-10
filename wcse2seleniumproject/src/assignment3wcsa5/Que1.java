package assignment3wcsa5;

import java.awt.Window;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que1 {
	private static final WebDriver JavascriptExecutor = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://omayo.blogspot.com/");
		WebElement ChildWindow = driver.findElement(By.partialLinkText("Open a popup window"));
		Point ElementLoc = ChildWindow.getLocation();
		int X = ElementLoc.getX();
		int Y = ElementLoc.getY();
		JavascriptExecutor JSE=(JavascriptExecutor)driver;
		JSE.executeScript("window.scrollBy("+Y+","+X+")");
		ChildWindow.click();

	}}

