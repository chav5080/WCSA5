package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsListAmazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_g50zekzm1_e&adgrpid=74238127911&hvpone=&hvptwo=&hvadid=610644609009&hvpos=&hvnetw=g&hvrand=7751949009254840610&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9040229&hvtargid=kwd-29089120&hydadcr=5496_2359482&gclid=EAIaIQobChMI5NWAioGa_QIVGiUrCh1qlg0xEAAYASAAEgK2NfD_BwE");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Redmi Mobiles");
		Thread.sleep(1000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(1000);
		List<WebElement> Redmi = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

		for(int i=0;i<Redmi.size();i++)
		{
			WebElement Mob = Redmi.get(i);
			String MI = Mob.getText();
			System.out.println(MI);
			Thread.sleep(1000);
		}
	}
}
