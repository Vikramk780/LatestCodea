package AlphaPages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnalyticsPage {

	WebDriver ldriver;
	Waithelp waithelp;
	
	public AnalyticsPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		waithelp = new Waithelp(ldriver);
	}
	
	@FindBy(xpath="(//p[contains(text(),'Add Dashboard')])[1]") WebElement adddashboardbtn;	
	@FindBy(xpath="//input[@id='name']") WebElement dashboardname;
	@FindBy(xpath="//button[@type='submit']") WebElement okaybtn;
	@FindBy(xpath="//p[contains(text(),\"Add Widget\")]") WebElement addwidgetbtn;
	@FindBy(xpath="//h5[contains(text(),\"Time series graphs\")]") WebElement timeserieslink;
	@FindBy(xpath="//h5[contains(text(),\"Pie charts\")]") WebElement pichartlink;
	
	@FindBy(xpath="//span[contains(text(),\"Next\")]") WebElement nextbtn;
	@FindBy(xpath="//p[contains(text(),\"Title\")]") WebElement titledrop;
	@FindBy(xpath="//input[@placeholder='Widget title']") WebElement widgettitleinputbar;
	@FindBy(xpath="(//p[contains(text(),\"Graph\")])[1]") WebElement graphdrop;
	@FindBy(xpath="(//button[@type=\"button\"])[8]") WebElement addgraphbtn;
	@FindBy(xpath="//div[@id='dataSource']") WebElement choosedatadrop;
	@FindBy(xpath="//li[normalize-space()='events']") WebElement datasourceasevents;
	@FindBy(xpath="//div[contains(text(),'Select metric')]") WebElement selectmetricbtn;
	@FindBy(xpath="//div[normalize-space()='Events Over Time']") WebElement eventovertimevalueselect;
	@FindBy(xpath="//div[normalize-space()='Events by Source']") WebElement eventsbysource;
	@FindBy(xpath="(//span[contains(text(),'Save')])[2]") WebElement savebtn;
	@FindBy(xpath="(//div[@role='button'])[11]") WebElement singlemetricdrop;
	@FindBy(xpath="//li[contains(text(),'Count')]") WebElement selectcount;
	@FindBy(xpath="//span[contains(text(),'Save')]") WebElement adddatasavebtn;
	private By finalnextbtnnextbtn =By.xpath("//span[contains(text(),\"Next\")]");
//	@FindBy(xpath="//span[contains(text(),\"Next\")]") By finalnextbtnnextbtn;
	@FindBy(xpath="//div[@id='basic-button']") WebElement actionsdrop;
	@FindBy(xpath="//li[normalize-space()='Save']") WebElement finalsavebtn;
	
	
	
	
	public void createDashboard() throws InterruptedException {
		adddashboardbtn.click();
		Thread.sleep(4000);
		String stringdata = RandomStringUtils.randomAlphabetic(8);
		dashboardname.sendKeys("Tesstk"+stringdata);
		okaybtn.click();
		addwidgetbtn.click();
		timeserieslink.click();
		nextbtn.click();
		titledrop.click();
		widgettitleinputbar.sendKeys("widgtets"+stringdata);
		addgraphbtn.click();
		choosedatadrop.click();
		datasourceasevents.click();
		selectmetricbtn.click();
		eventovertimevalueselect.click();
		savebtn.click();
		singlemetricdrop.click();
		selectcount.click();
		adddatasavebtn.click();
		Thread.sleep(2000);
		waithelp.forThisElementWait(finalnextbtnnextbtn, 10).click();
		//finalnextbtnnextbtn.click();
		actionsdrop.click();
		finalsavebtn.click();
		Thread.sleep(2000);
		
	}
	
	
	public void createDashboardforPiechart() throws InterruptedException {
		adddashboardbtn.click();
		Thread.sleep(4000);
		String stringdata = RandomStringUtils.randomAlphabetic(8);
		dashboardname.sendKeys("Testksk"+stringdata);
		okaybtn.click();
		addwidgetbtn.click();
		pichartlink.click();
		nextbtn.click();
		titledrop.click();
		widgettitleinputbar.sendKeys("widgetst"+stringdata);
		addgraphbtn.click();
		choosedatadrop.click();
		datasourceasevents.click();
		selectmetricbtn.click();
		eventsbysource.click();
		savebtn.click();
		singlemetricdrop.click();
		selectcount.click();
		adddatasavebtn.click();
		Thread.sleep(2000);
		waithelp.forThisElementWait(finalnextbtnnextbtn, 10).click();
		//finalnextbtnnextbtn.click();
		actionsdrop.click();
		finalsavebtn.click();
		Thread.sleep(2000);
		
	}
}
