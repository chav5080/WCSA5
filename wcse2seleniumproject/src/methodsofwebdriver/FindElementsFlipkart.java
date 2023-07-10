package methodsofwebdriver;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsFlipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		List<WebElement> Mobname = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		Thread.sleep(1000);

		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		Thread.sleep(1000);

		/*for(WebElement moblist:Mobname)
		{
			String Name = moblist.getText();
			System.out.println(Name);
			Thread.sleep(2000);	


		} */

		for (int a=0;a<Mobname.size();a++)
		{
			WebElement List = Mobname.get(a);
			String Mobiles = List.getText();
			//System.out.println(Mobiles);
			//Thread.sleep(1000);
			for(int b=a;b<=a;b++)
			{ 
				String priceList = price.get(b).getText();
				System.out.print(Mobiles +":"+priceList);
				

			}
			System.out.println();
			Thread.sleep(2000);
		
		}
	}
}
