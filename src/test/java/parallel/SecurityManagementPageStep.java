package parallel;

import java.awt.AWTException;

import AlphaPages.HomePage;
import AlphaPages.IntegrationMeshPage;
import AlphaPages.LoginPage;
import AlphaPages.SecurityManagementPage;
import alpha.drivers.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SecurityManagementPageStep {
	LoginPage loginPage;
	HomePage homePage;
	SecurityManagementPage securityManagementPage;
	
	@Given("visit securitymanagement page")
	public void visit_securitymanagement_page() throws InterruptedException {
		DriverFactory.getDriver().get("https://stageapp.botprise.com");
		loginPage = new LoginPage(DriverFactory.getDriver());
		loginPage.doLogin();
		homePage= new HomePage(DriverFactory.getDriver());
		homePage.clikOnCompanyLinkandlandonDashboard();
		securityManagementPage=homePage.visitsecuritymanagementpage();
	}

	@Then("create text secrete")
	public void create_text_secrete() throws InterruptedException {
		securityManagementPage.textsecrete();
	}
	
	@Then("create file secrete")
	public void create_file_secrete() throws InterruptedException, AWTException {
		securityManagementPage.createfile();
	}
	
	@Then("create windows creds")
	public void create_windows_creds() throws InterruptedException, AWTException {
		securityManagementPage.WindowsCreds();
	}

	@Then("create terminal creds")
	public void create_terminal_creds() throws InterruptedException, AWTException {
		securityManagementPage.createCredsforTeminal();
	}
	
}
