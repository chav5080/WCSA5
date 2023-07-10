package methodsofwebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		WebElement Down = driver.findElement(By.xpath("//h1[.='Downloads']"));
		Rectangle React = Down.getRect();
		int X = React.getX();
		int Y = React.getY();
		System.out.println(X+" "+Y);

		int H = React.getHeight();
		int W = React.getWidth();
		System.out.println(H+ " "+W);

		String Name = Down.getTagName();
		System.out.println(Name);
	}
}
