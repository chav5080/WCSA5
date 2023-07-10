package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowserAvoidExcepations {
	public static void main(String[] args) {
		System.setProperty("Webdriver.edge.driver","./drivers/msedgedriver.exe");
		new EdgeDriver();
	}
}
