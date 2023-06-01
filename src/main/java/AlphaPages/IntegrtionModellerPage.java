package AlphaPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IntegrtionModellerPage {
 WebDriver ldriver;
 Waithelp waithelp;
	
	
	public IntegrtionModellerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		waithelp = new Waithelp(ldriver);
	}
	private By createbtn = By
			.xpath("(//p[contains(text(),\"Create\")])[1]");
	private By name = By.xpath("(//input[@id='name'])[1]");

	private By typeDrope = By.xpath("(//input[@id='type'])[1]");

	private By itsmvalue = By.xpath("(//li[@id='type-option-45'])[1]");
	private By selecttypeDrope = By.xpath("(//input[@type='checkbox'])[27]");
	private By supportVersion = By.xpath("(//input[@id='free-chip-input'])[1]");
	private By variableDefination = By.xpath("(//input[@id='free-chip-input'])[2]");
	private By servicenow_instance = By.xpath("/html[1]/body[1]/div[4]/div[3]/div[2]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/input[1]");
	private By username_ = By.xpath("/html[1]/body[1]/div[4]/div[3]/div[2]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[2]/input[1]");

	private By password_ = By.xpath("/html[1]/body[1]/div[4]/div[3]/div[2]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[2]/input[1]");

	private By imageupload = By.xpath("(//*[local-name()='svg' and @class='MuiSvgIcon-root'])[46]");

	private By uploadbtn = By.xpath("/html[1]/body[1]/div[5]/div[3]/div[2]/div[1]/form[1]/div[1]/div[2]/div[4]/button[1]/span[1]/div[1]");

	private By categorydrop = By.xpath("(//input[@id='free-chip-input'])[3]"); // WebElement.sendKeys(Keys.DOWN,
																				// Keys.RETURN);
	private By servicedesk = By.xpath("//li[contains(text(),'ServiceDesk')]");
	private By curlfield = By.xpath("(//textarea[@id='curlOperation'])[1]");
	private By testBTN = By.xpath("(//button[@type=\"submit\"])[1]");
	private By nextbtn = By.xpath("/html[1]/body[1]/div[4]/div[3]/div[2]/div[1]/form[1]/div[4]/button[2]/span[1]");
	private By textarea = By
			.xpath("(//textarea[@placeholder='Write a few words about the integration and what it helps achieve'])[1]");
	private By textarea2 = By
			.xpath("/html[1]/body[1]/div[3]/div[3]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/textarea[1]");
	private By capebilities = By.xpath("(//textarea[@name=\"capabilities\"])[1]");
	private By certification = By.xpath("(//input[@name='certificationLevel'])[5]");
	private By savebtnn = By.xpath("(//button[@type=\"submit\"])[1]");
	private By selectresposnse = By.xpath("/html[1]/body[1]/div[4]/div[3]/div[2]/div[1]/form[1]/div[3]/div[2]/div[2]/div[24]/div[3]/div[1]/span[1]/span[1]/input[1]");
	
	
	
	public void CreateIntegrationThroughmodeller(String string,String string2,String string3, String string4) throws InterruptedException, AWTException {
		Robot rr = new Robot();
		

		waithelp.forThisElementWait(createbtn, 30).click();
		Thread.sleep(4000);
//		waithelper.forThisElementWait(imageupload, 20).sendKeys("./SNOW.jfif");
//		waithelper.forThisElementWait(imageupload, 20).click();
//
//		String filename = "./SNOW.jfif";
//		File file = new File(filename);
//		String path = file.getAbsolutePath();
//		// give the URL to upload
//
//		waithelper.forThisElementWait(imageupload, 20).click();
		JavascriptExecutor jse = (JavascriptExecutor) ldriver;
		
		
		

		String randomeBTUname = RandomStringUtils.random(4, "abca_d");
		String randomeBTUname1 = "testAutomation".concat(randomeBTUname + "tem_st");
//		driver.findElement(name).click();
		ldriver.findElement(name).sendKeys(randomeBTUname1);
		waithelp.forThisElementWait(typeDrope, 20).click();
		Thread.sleep(4000);
		ldriver.findElement(itsmvalue).click();

		Thread.sleep(2000);
		Robot r = new Robot();
		
		Actions act = new Actions(ldriver);

		ldriver.findElement(supportVersion).sendKeys("1.1");
		act.moveToElement(waithelp.forThisElementWait(supportVersion, 20)).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		
		
		ldriver.findElement(variableDefination).sendKeys("servicenow_instance");
		
		act.moveToElement(waithelp.forThisElementWait(variableDefination, 20)).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);

		waithelp.forThisElementWait(variableDefination, 20).sendKeys("username");
		act.moveToElement(waithelp.forThisElementWait(variableDefination, 20)).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		
		waithelp.forThisElementWait(variableDefination, 20).sendKeys("password");
		act.moveToElement(waithelp.forThisElementWait(variableDefination, 20)).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		
		waithelp.forThisElementWait(categorydrop, 20).click();
		waithelp.forThisElementWait(servicedesk, 20).click();
		
		Thread.sleep(1000);

		
		ldriver.findElement(curlfield).sendKeys(
				"curl -XPOST -H \"Content-type: application/json\" -d '{\"description\":\"Test Description\"}' 'https://$servicenow_instance/api/now/table/incident' -u $username:'$password'");

						Thread.sleep(500);
		
		ldriver.findElement(username_).sendKeys(string);
		Thread.sleep(500);
		ldriver.findElement(password_).sendKeys(string2);
		Thread.sleep(500);
		ldriver.findElement(servicenow_instance).sendKeys(string3);

		Thread.sleep(1000);
		

		

//		WebElement webElement = driver.findElement(By.xpath("(//label[contains(text(),\"Select file \")])[1]"));
//		jse.executeScript("arguments[0].click();", webElement);
		
		jse.executeScript("document.getElementById('uploadImage').click();");

		Thread.sleep(3000);
		StringSelection filepath = new StringSelection("C:\\Users\\Deva\\Downloads\\ServiceNow.jpg");
//		StringSelection filepath = new StringSelection("./SNOW.jfif");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		Thread.sleep(1000);
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
		
		
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(20));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[4]/div[3]/div[2]/div[1]/form[1]/div[1]/div[2]/div[4]/button[1]/span[1]"))); 
		((JavascriptExecutor)ldriver).executeScript("arguments[0].click();", element);

//		waithelper.forThisElementWait(uploadbtn,30).click();
		Thread.sleep(3500);

		ldriver.findElement(testBTN).click();
		Thread.sleep(4000);
		Robot robot = new Robot();
		
		for(int i=1; i<7; i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}
		
		
//		
//		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[4]/div[3]/div[2]/div[1]/form[1]/div[3]/div[2]/div[2]/div[2]/div[3]/div[1]/span[1]/span[1]/input[1]"))); 
//		((JavascriptExecutor)ldriver).executeScript("arguments[0].click();", element1);

		
		Actions act1 =  new Actions(ldriver);
		act1.moveToElement(ldriver.findElement(selectresposnse)).click().perform();
		Thread.sleep(3000);

		act1.moveToElement(ldriver.findElement(nextbtn)).click().perform();
		
		

		Thread.sleep(4000);
		
		

		ldriver.findElement(By.xpath(
				"(//textarea[@placeholder='Write a few words about the integration and what it helps achieve'])[1]"))
				.sendKeys("Open Ticket ,Close Ticket");
		Thread.sleep(2000);
		ldriver.findElement(By.xpath(
				"(//textarea[@placeholder='Write a few words about the capabilities and potential tasks that can be achieved by this integration - example: Open a ticker, update a ticket, assign ticket to a queue, etc.'])[1]"))
				.sendKeys("This Integration Is having Capability to open ticket and close ticket");
		Thread.sleep(2000);

		ldriver.findElement(savebtnn).click();
		Thread.sleep(3000);

		Thread.sleep(3000);
//		StringSelection filepath = new StringSelection("C:\\Users\\kvikram\\Downloads\\SNOW.jfif");
	}
}
