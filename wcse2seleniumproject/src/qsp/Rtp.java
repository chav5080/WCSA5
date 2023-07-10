package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Rtp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("select browser which you want...");
		String browserValue= sc.next();

		if(browserValue.equals("chrome"))

		{ System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		}

		else if (browserValue.equals("edge"))

		{ System.setProperty("Webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		}

		else 
		{ System.out.println("Select the valid browser");
		}
	}
}
