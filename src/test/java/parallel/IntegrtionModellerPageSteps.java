package parallel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import AlphaPages.HomePage;
import AlphaPages.IntegrtionModellerPage;
import AlphaPages.LoginPage;
import alpha.drivers.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class IntegrtionModellerPageSteps {

	LoginPage loginPage;
	HomePage homePage;
	IntegrtionModellerPage integrtionModellerPage;
	
	
	@Given("user visits integration modeller")
	public void user_visits_integration_modeller() throws InterruptedException, AWTException {
		DriverFactory.getDriver().get("https://stageapp.botprise.com");
		Robot robot = new Robot();
		for(int i=0; i<5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
		}
		
		loginPage = new LoginPage(DriverFactory.getDriver());
		loginPage.doLogin();
		homePage= new HomePage(DriverFactory.getDriver());
		homePage.clikOnCompanyLinkandlandonDashboard();
		integrtionModellerPage=homePage.gotoIntegrationModellerPage();
	}

//	@Then("user creates integrtion with username  {string} password {string} and url {string} and curl \"curl -XPOST -H \"Content-type: application\\/json\" -d {string} {string} -u $username:{string}\" username \"admin\" servicenow_instance \"dev59080.service-now.com\" password \"eh8+IZ%zZiU8\"")
//	public void user_creates_integrtion_with_username_password_and_url_and_curl_curl_xpost_h_content_type_application_json_d_u_$username_username_admin_servicenow_instance_dev129330_service_now_com_password_eh8_iz_z_zi_u8(String string, String string2, String string3, String string4, String string5, String string6) throws InterruptedException, AWTException {
//		integrtionModellerPage.CreateIntegrationThroughmodeller(string,string2,string3,string4);
//	}
	
	

@Then("user creates integrtion with username  {string} password {string} and url {string} and curl \"curl -XPOST -H \"Content-type: application\\/json\" -d {string} {string} -u $username:{string}\" username \"admin\" servicenow_instance \"{int}.service-now.com\" password \"x4W@HmmX=xL2\"")
public void user_creates_integrtion_with_username_password_and_url_and_curl_curl_xpost_h_content_type_application_json_d_u_$username_username_admin_servicenow_instance_service_now_com_password_x4w_hmm_x_x_l2(String string, String string2, String string3, String string4, String string5, String string6, Integer int1) throws InterruptedException, AWTException {
	integrtionModellerPage.CreateIntegrationThroughmodeller(string,string2,string3,string4);
}
}
