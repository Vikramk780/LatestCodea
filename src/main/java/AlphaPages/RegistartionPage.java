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
import org.openqa.selenium.support.PageFactory;

public class RegistartionPage {
	 Waithelp waithelp;
	WebDriver ldriver;
	
	public RegistartionPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		waithelp = new Waithelp(ldriver);
		
	}
	
	private By emailfield = By.xpath("//input[@id='email']");
	private By firstname = By.xpath("//input[@id='firstName']");
	private By lastname = By.xpath("//input[@id='lastName']");
	private By company = By.xpath("//input[@id='company']");
	private By designation = By.xpath("//input[@id='designation']");
	private By passwordt = By.xpath("//input[@id='password']");
	private By confirmpasswordt = By.xpath("//input[@id='confirmPassword']");
	private By radiobtn = By.xpath("//input[@type='radio']");
	private By signupbtn = By.xpath("//button[@type=\"submit\"]");
	
	private By succesmsg =By.xpath("//p[contains(text(),\"A sign-up confirmation email has been sent to the email address provided. Click on the link in the email to complete the sign-up process and gain access to your account.\")]");
	
	
	
	
	public void createUser() throws InterruptedException, AWTException {
		JavascriptExecutor js =(JavascriptExecutor) ldriver;
		Thread.sleep(2000);
		Robot robot = new Robot();
		for (int i = 1; i < 7; i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}
		
		String randomeBTUname = RandomStringUtils.random(4, "aba_cd");
		String randomeBTUname1 = "Testuser".concat(randomeBTUname + "new");
      ldriver.findElement(emailfield).sendKeys(randomeBTUname1+"@botprise.com");
      ldriver.findElement(firstname).sendKeys(randomeBTUname1);
      ldriver.findElement(lastname).sendKeys(randomeBTUname1+"test");
      ldriver.findElement(company).sendKeys(randomeBTUname1+"testcompany");
      ldriver.findElement(designation).sendKeys(randomeBTUname1+"testsdesignation");
      ldriver.findElement(passwordt).sendKeys("Xx@12345");
      ldriver.findElement(confirmpasswordt).sendKeys("Xx@12345");
      Thread.sleep(3000);
     
     WebElement eleradio =ldriver.findElement(radiobtn);
     js.executeScript("arguments[0].click();" ,eleradio);
//      ldriver.findElement(radiobtn).click();
     Thread.sleep(500);
     
     WebElement eleradio1=ldriver.findElement(signupbtn);
     js.executeScript("arguments[0].click();" ,eleradio1);
     Thread.sleep(500);
//      ldriver.findElement(signupbtn).click();
	}
	public void verifysuccesmsg(String msgfromfeaturefile) throws InterruptedException {
		String msgverify=ldriver.findElement(succesmsg).getText();
		msgverify.equals(msgfromfeaturefile);
		Thread.sleep(500);
	}
	
}
