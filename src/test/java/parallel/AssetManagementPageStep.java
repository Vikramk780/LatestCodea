package parallel;

import java.awt.AWTException;

import AlphaPages.AssetManageMentPage;
import AlphaPages.HomePage;
import AlphaPages.LoginPage;
import alpha.drivers.DriverFactory;
import io.cucumber.java.en.Given;

public class AssetManagementPageStep {

	LoginPage loginPage;
	HomePage homePage;
	AssetManageMentPage assetManageMentPage;
	
	@Given("user visits to assetmanagmentpage")
	public void user_visits_to_assetmanagmentpage() throws InterruptedException {
		DriverFactory.getDriver().get("https://stageapp.botprise.com");
		loginPage = new LoginPage(DriverFactory.getDriver());
		loginPage.doLogin();
		homePage= new HomePage(DriverFactory.getDriver());
		homePage.clikOnCompanyLinkandlandonDashboard();
		assetManageMentPage=homePage.assetmanagementPage();
	}

	@Given("creates asset")
	public void creates_asset() throws AWTException, InterruptedException {
		assetManageMentPage.createAsset();
	}
}
