package parallel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import AlphaPages.AnalyticsPage;
import AlphaPages.HomePage;
import AlphaPages.LoginPage;
import alpha.drivers.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AnalyticsPageSteps {
	LoginPage loginPage;
	HomePage homePage;
	AnalyticsPage analyticsPage;

	@Given("user visits analytics page")
	public void user_visits_analytics_page() throws AWTException {
		DriverFactory.getDriver().get("https://stageapp.botprise.com");
		loginPage = new LoginPage(DriverFactory.getDriver());
		loginPage.doLogin();
		
		Robot robot = new Robot();
		for(int i=0; i<4; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
		}
	}

	@Then("user creates dashboard for series chart")
	public void user_creates_dashboard_for_series_chart() throws InterruptedException {
		homePage= new HomePage(DriverFactory.getDriver());
		homePage.clikOnCompanyLinkandlandonDashboard();
		analyticsPage= new AnalyticsPage(DriverFactory.getDriver());
		analyticsPage=homePage.visitanalyticspage();
		analyticsPage.createDashboard();
	}
	
	@Then("user creates dashboard for pie chart")
	public void user_creates_dashboard_for_pie_chart() throws InterruptedException {
		homePage= new HomePage(DriverFactory.getDriver());
		homePage.clikOnCompanyLinkandlandonDashboard();
		analyticsPage= new AnalyticsPage(DriverFactory.getDriver());
		analyticsPage=homePage.visitanalyticspage();
		analyticsPage.createDashboardforPiechart();
	}
}
