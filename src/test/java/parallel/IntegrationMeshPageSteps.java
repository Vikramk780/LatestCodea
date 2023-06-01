package parallel;

import java.awt.AWTException;

import AlphaPages.HomePage;
import AlphaPages.IntegrationMeshPage;
import AlphaPages.LoginPage;
import alpha.drivers.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class IntegrationMeshPageSteps {
	LoginPage loginPage;
	HomePage homePage;
	IntegrationMeshPage integrationMeshPage;
	
	
	@Given("user visits integrtion mesh")
	public void user_visits_integrtion_mesh() throws InterruptedException {
		DriverFactory.getDriver().get("https://stageapp.botprise.com");
		loginPage = new LoginPage(DriverFactory.getDriver());
		loginPage.doLogin();
		homePage= new HomePage(DriverFactory.getDriver());
		homePage.clikOnCompanyLinkandlandonDashboard();
		integrationMeshPage=homePage.visitintegrationpage();
	}

	@Then("User Creates Integration with username {string} password {string} and url {string}")
	public void user_creates_integration_with_username_password_and_url(String string, String string2, String string3) throws InterruptedException, AWTException {
		integrationMeshPage.ceatemeshInstance(string, string2, string3);
	}
}
