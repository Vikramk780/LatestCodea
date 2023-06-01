package AlphaPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssetManageMentPage {
    
	WebDriver ldriver;
	
	public AssetManageMentPage(WebDriver rdriver) {
		ldriver=rdriver;
	    PageFactory.initElements(ldriver, this);
	}
	@FindBy(xpath="(//p[normalize-space()='Add'])[1]") WebElement addbtn;
	@FindBy(xpath="//input[@id='device_list_name']") WebElement namefield;
	@FindBy(xpath="//input[@id='description']") WebElement descriptionfield;
	@FindBy(xpath="//input[@id='device_type']") WebElement devicedrop;
	@FindBy(xpath="//li[normalize-space()='Alcatel']") WebElement alkateldevice;
	@FindBy(xpath="//label[@for='item']") WebElement choosefile;
	@FindBy(xpath="//button[@type='submit']") WebElement savebtn;
	
	public void createAsset() throws AWTException, InterruptedException {
		Robot rr = new Robot();
		addbtn.click();
		String stringdata = RandomStringUtils.randomAlphabetic(8);
		namefield.sendKeys("Asset"+stringdata);
		descriptionfield.sendKeys("Asset"+stringdata);
		devicedrop.click();
		alkateldevice.click();
		choosefile.click();
		StringSelection filepath = new StringSelection("C:\\Users\\Deva\\Downloads\\asset-list-sample.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		Thread.sleep(2000);
		rr.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);

		rr.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		rr.keyRelease(KeyEvent.VK_V);
		rr.keyRelease(KeyEvent.VK_CONTROL);

		rr.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rr.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		savebtn.click();
		Thread.sleep(3000);
		
		
	}
}
