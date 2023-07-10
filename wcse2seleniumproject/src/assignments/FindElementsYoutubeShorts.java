package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsYoutubeShorts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		List<WebElement> Yshorts = driver.findElements(By.xpath("//span[@class='style-scope ytd-rich-grid-slim-media']"));
		Thread.sleep(1000);
		List<WebElement> Yviews = driver.findElements(By.xpath("//span[@class='inline-metadata-item style-scope ytd-video-meta-block']"));
		Thread.sleep(1000);
		for(int a=0;a<Yshorts.size();a++)
		{
			WebElement List = Yshorts.get(a);
			String Yname = List.getText();
			System.out.println(Yname);
			Thread.sleep(1000);

			for(int b=0;b<Yviews.size();b++)
			{ 
				WebElement List1 = Yviews.get(b);
				String Viewname = List1.getText();
				System.out.println(Yname+":"+Viewname);
				Thread.sleep(1000);
			}
		}	

	}

}
