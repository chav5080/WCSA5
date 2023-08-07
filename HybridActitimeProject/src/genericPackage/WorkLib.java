package genericPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WorkLib extends BaseTest {

	// Handle Alert Popup
	public void acceptAlertPopUp()
	{
		driver.switchTo().alert().accept();
	} 

	public void dismissAlertPopup()
	{
		driver.switchTo().alert().dismiss();
	}

	//Handle Confirmation Popup

	public void acceptConfirmationPopup()
	{
		driver.switchTo().alert().accept();
	}
	public void dismissConfirmationPopup()
	{
		driver.switchTo().alert().dismiss();
	}

	//Handle Frame

	public void handleFrameByusingIndex(int index)
	{
		driver.switchTo().frame(index);
	}

	public void handleFrameByusingStringNameorId(String nameorId)
	{
		driver.switchTo().frame(nameorId);
	}

	public void handleFrameByusingFrameElement(WebElement fremEle)
	{
		driver.switchTo().frame(fremEle);
	}

	public void switchTomainPage()
	{
		driver.switchTo().defaultContent();
	}

	public void switchToParentPage()
	{
		driver.switchTo().parentFrame();
	}

	// Handle the Mouse Action

	public void mouseHoverMethod(WebElement target)
	{
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
	}

	public void doubleClickMethod(WebElement target)
	{
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
	}

	public void dragAndDropMethod(WebElement src, WebElement target)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(src,target).perform();
	}

	// Handle keyBoard Action

	public void hiEnterButtonMethod() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public void hiTabButtonMethod() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}

	// handle DROPDOWN

	public void selectByIndexMethod(WebElement element, int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public void selectByVisibleTextMethod(WebElement element, String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	public void selectByValueMethod(WebElement element, String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);

	}
}
