package AlphaPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IntegrationMeshPage {
	WebDriver ldriver;
	Waithelp waithelp;

	public IntegrationMeshPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
		waithelp = new Waithelp(ldriver);

	}

	@FindBy(xpath = "(//p[contains(text(),\"Add Integration\")])[1]")
	WebElement addintegrationbtn;
	@FindBy(xpath = "//span[normalize-space()='ITSM']")
	WebElement sidebaritsm;
	@FindBy(xpath = "//img[@alt='ServiceNow']")
	WebElement servicenowtool;
	@FindBy(xpath = "//span[contains(text(),\"Next\")]")
	WebElement nextbtn;
	@FindBy(xpath = "//input[@name='name']")
	WebElement namefield;
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordfield;
	@FindBy(xpath = "//input[@name='username']")
	WebElement usernamefield;
	@FindBy(xpath = "//input[@name='servicenow_instance']")
	WebElement urlfield;
	@FindBy(xpath = "//div[contains(text(),'Test')]")
	WebElement testbtn;
	@FindBy(xpath = "//span[normalize-space()='Next']")
	WebElement nextbtnaftertest;
//	private WebElement nextbtnaftertest = By.xpath("//span[normalize-space()='Next']");

	@FindBy(xpath = "//span[normalize-space()='Skip & Save']")
	WebElement skipandsave;

	public void ceatemeshInstance(String username, String paswod, String url)
			throws InterruptedException, AWTException {
		addintegrationbtn.click();
		Thread.sleep(2000);
		sidebaritsm.click();
		Thread.sleep(2000);
		servicenowtool.click();
		Thread.sleep(2000);
		nextbtn.click();
		Thread.sleep(2000);

		String stringdata = RandomStringUtils.randomAlphabetic(8);
		namefield.sendKeys("ServiceNow" + stringdata);
		usernamefield.sendKeys(username);
		Robot robot = new Robot();
		for (int i = 1; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}
		passwordfield.sendKeys(paswod);
		urlfield.sendKeys(url);
		Thread.sleep(2000);

		Actions act = new Actions(ldriver);
		
		act.moveToElement(testbtn).click().perform();
//		nextbtnaftertest.click();
		Thread.sleep(4000);
		for (int i = 1; i < 7; i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(2000);
		act.moveToElement(nextbtnaftertest).click().perform();
//		nextbtnaftertest.click();
		

//		JavascriptExecutor executor = (JavascriptExecutor)ldriver;
//		executor.executeScript("arguments[0].click();", nextbtnaftertest);

		Thread.sleep(4000);
		for (int i = 1; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}

//		nextbtnaftertest.click();
		Thread.sleep(500);

		skipandsave.click();
		Thread.sleep(3000);

	}
}
