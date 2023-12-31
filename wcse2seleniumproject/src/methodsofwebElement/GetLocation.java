package methodsofwebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
	public static void main(String[] args) throws InterruptedException {



		// Another Way
		//System.setProperty("Webdriver.chrome.driver","./drivers.chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://www.selenium.dev/downloads/");
		//Thread.sleep(3000);
		//WebElement Down = driver.findElement(By.xpath("//h1[.='Downloads']"));
		//Point Loc = Down.getLocation();
		//System.out.println(Loc);


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/downloads/");

		WebElement download = driver.findElement(By.xpath("//h1[text()='Downloads']"));


		Point loc = download.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();

		System.out.println(xaxis+ "  " +yaxis);
	}}