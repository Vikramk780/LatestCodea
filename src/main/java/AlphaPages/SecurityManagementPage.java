package AlphaPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SecurityManagementPage {
	WebDriver ldriver;
	Waithelp waithelp;
	
	public SecurityManagementPage(WebDriver rdriver) {
		ldriver=rdriver;
	    PageFactory.initElements(ldriver, this);
		waithelp = new Waithelp(ldriver);
	}
	private By addbtn = By.xpath("(//p[contains(text(),\"Add\")])[1]");
	private By addbtn2 = By.xpath("(//p[contains(text(),\"Add\")])[3]");
	private By text = By.xpath("(//li[contains(text(),\"Text\")])[1]");
	private By filebtn = By.xpath("(//li[contains(text(),\"File\")])[1]");
	private By securitymanagerdrop = By.xpath("//input[@id='security_manager']");
	private By vault = By.xpath("//li[@role='option']");
	private By nameofsecret = By.xpath("//input[@id='name']");
	private By textofsecret = By.xpath("//input[@id='file']");
	private By savebtn = By.xpath("//button[@type='submit']");
	private By chosefile = By.xpath("//label[@for='item']");
	private By linkmanagement = By.xpath("//a[normalize-space()='Security Management']");
	private By windowscreds = By.xpath("(//li[contains(text(),\"Windows\")])[1]");
	private By terminalcreds = By.xpath("(//li[@role='menuitem'][normalize-space()='Terminal'])[1]");
	private By authscemen = By.xpath("//input[@id='auth_scheme']");
	private By windowsdomain = By.xpath("//input[@id='domain']");
	private By username = By.xpath("//input[@id='user_name']");
	private By secretsdrop = By.xpath("//input[@id='secrets']");
	private By connectionType = By.xpath("//input[@id='connection_type']");
	private By ssh = By.xpath("//li[normalize-space()='SSH']");
	private By port = By.xpath("//input[@id='port']");
	private By authscema = By.xpath("//input[@id='auth_scheme']");
	private By sshauth = By.xpath("//li[normalize-space()='SSH Password/Key']");
	private By passphras = By.xpath("//input[@id='passphrase']");
	private By passphrasselect = By.xpath("//li[@role='option']");
	private By selectsecrete = By.xpath("//li[@id='secrets-option-3']");
	
	
	public void textsecrete() throws InterruptedException {
		waithelp.forThisElementWait(addbtn, 10).click();
		waithelp.forThisElementWait(text, 10).click();
		waithelp.forThisElementWait(securitymanagerdrop, 15).click();
		waithelp.forThisElementWait(vault, 15).click();

		String randomeBTUname = RandomStringUtils.random(4, "aba_cd");
		String randomeBTUname1 = "secret".concat(randomeBTUname + "te_lst");

		waithelp.forThisElementWait(nameofsecret, 15).sendKeys(randomeBTUname1);
		waithelp.forThisElementWait(textofsecret, 15).sendKeys(randomeBTUname1);
		waithelp.forThisElementWait(savebtn, 15).click();
		Thread.sleep(4000);
	}
	
	
	
	public void createfile() throws InterruptedException, AWTException {
		Robot rr = new Robot();
		Thread.sleep(2000);
		waithelp.forThisElementWait(addbtn,35).click();
		waithelp.forThisElementWait(filebtn, 35).click();

		waithelp.forThisElementWait(securitymanagerdrop, 15).click();
		waithelp.forThisElementWait(vault, 15).click();
		String randomeBTUname = RandomStringUtils.random(4, "abcd");
		String randomeBTUname1 = "secret".concat(randomeBTUname + "te_st");

		waithelp.forThisElementWait(nameofsecret, 15).sendKeys(randomeBTUname1);
		waithelp.forThisElementWait(chosefile, 15).click();
		Thread.sleep(2000);
		StringSelection filepath = new StringSelection("C:\\Users\\Deva\\Downloads\\ProdAccountList.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		Thread.sleep(1000);
		rr.keyPress(KeyEvent.VK_CONTROL);

		rr.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		rr.keyRelease(KeyEvent.VK_V);
		rr.keyRelease(KeyEvent.VK_CONTROL);

		rr.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rr.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		waithelp.forThisElementWait(savebtn, 15).click();
		Thread.sleep(4000);

	}
	
	public void WindowsCreds() throws InterruptedException, AWTException {

		
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);
		waithelp.forThisElementWait(addbtn2, 15).click();
		waithelp.forThisElementWait(windowscreds, 15).click();

		String randomeBTUname11 = RandomStringUtils.random(4, "abcd");
		String randomeBTUname11aa = "test_windows".concat(randomeBTUname11 + "test");
		waithelp.forThisElementWait(nameofsecret, 15).sendKeys(randomeBTUname11aa);
		waithelp.forThisElementWait(authscemen, 15).click();
		waithelp.forThisElementWait(vault, 15).click();
		waithelp.forThisElementWait(windowsdomain, 15).sendKeys("cc");

		waithelp.forThisElementWait(username, 15).sendKeys(randomeBTUname11aa);
		waithelp.forThisElementWait(secretsdrop, 15).click();

		waithelp.forThisElementWait(selectsecrete, 15).click();
		waithelp.forThisElementWait(savebtn, 15).click();
		Thread.sleep(4000);
	}

	public void createCredsforTeminal() throws InterruptedException, AWTException {
		
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);
		waithelp.forThisElementWait(addbtn2, 15).click();
		waithelp.forThisElementWait(terminalcreds, 15).click();

		String randomeBTUname11 = RandomStringUtils.random(4, "abcd");
		String randomeBTUname11aa = "test_Terminal".concat(randomeBTUname11 + "teso_t");

		waithelp.forThisElementWait(nameofsecret, 15).sendKeys(randomeBTUname11aa);

		waithelp.forThisElementWait(connectionType, 15).click();
		waithelp.forThisElementWait(ssh, 15).click();
		waithelp.forThisElementWait(port, 15).sendKeys("8080");
		waithelp.forThisElementWait(authscema, 15).click();
		waithelp.forThisElementWait(sshauth, 15).click();

		waithelp.forThisElementWait(username, 15).sendKeys(randomeBTUname11aa);
		waithelp.forThisElementWait(secretsdrop, 15).click();

		waithelp.forThisElementWait(selectsecrete, 15).click();

		waithelp.forThisElementWait(passphras, 15).click();

		waithelp.forThisElementWait(passphrasselect, 15).click();

		waithelp.forThisElementWait(savebtn, 15).click();
		Thread.sleep(4000);
	}
}
