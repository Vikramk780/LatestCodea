package parallel;


import org.openqa.selenium.WebDriver;

import AlphaPages.HomePage;
import AlphaPages.LoginPage;
import alpha.drivers.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps {

	HomePage homePage;
	LoginPage loginPage;
	DriverFactory driverFactory;
	WebDriver ldriver;
	
	
	@Given("user logs in to homepage")
	public void user_logs_in_to_homepage() {
		driverFactory = new DriverFactory();
	
		
		loginPage = new LoginPage(DriverFactory.getDriver());
		driverFactory.getDriver().get("https://stageapp.botprise.com");
		loginPage.doLogin();
	    
	}

	@Then("user cliks on company")
	public void user_cliks_on_company() throws InterruptedException {
		homePage= new HomePage(DriverFactory.getDriver());
		homePage.clikOnCompanyLinkandlandonDashboard();
	    
	}
}
