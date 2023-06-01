package AlphaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver ldriver;
	Waithelp waithelp;
	
	public HomePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
		waithelp = new Waithelp(ldriver);
	}
	
	
	@FindBy(css="td:nth-child(1)") WebElement companylink;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/button[1]/span[1]/*[name()='svg'][1]") WebElement hammenu;
	@FindBy(xpath="//span[contains(text(),'Analytics')]") WebElement analyicsmenu;
	@FindBy(xpath="//span[normalize-space()='Asset Management']") WebElement assetmanagementmenu;
	@FindBy(xpath="//span[contains(text(),\"Integration Mesh\")]") WebElement integrationmeshmenu;
	@FindBy(xpath="//span[contains(text(),\"Security Management\")]") WebElement securitypagemenu;
	
	private By DevWorkbenchMenu = By.xpath("//span[contains(text(),\"Developer Workbench\")]");

	private By integrations = By.xpath("(//span[contains(text(),\"Integrations\")])[1]");
	
	public void clikOnCompanyLinkandlandonDashboard() throws InterruptedException {
		Thread.sleep(2000);
		companylink.click();
		hammenu.click();
		Thread.sleep(3000);
	}
	
	public AnalyticsPage visitanalyticspage() throws InterruptedException {
		Thread.sleep(3000);
		analyicsmenu.click();
		return new AnalyticsPage(ldriver);
	}
	
	public AssetManageMentPage assetmanagementPage() throws InterruptedException {
		Thread.sleep(3000);
		assetmanagementmenu.click();
		return new AssetManageMentPage(ldriver);
	}
	public IntegrationMeshPage visitintegrationpage() throws InterruptedException {
		Thread.sleep(3000);
		integrationmeshmenu.click();
		return new IntegrationMeshPage(ldriver);
	}
	
	public SecurityManagementPage visitsecuritymanagementpage() throws InterruptedException {
		Thread.sleep(3000);
		securitypagemenu.click();
		return new SecurityManagementPage(ldriver);
	}
	public IntegrtionModellerPage gotoIntegrationModellerPage() throws InterruptedException {
		Thread.sleep(3000);
		waithelp.forThisElementWait(DevWorkbenchMenu, 20).click();
		waithelp.forThisElementWait(integrations, 20).click();
		
		return new IntegrtionModellerPage(ldriver);
	}
}
