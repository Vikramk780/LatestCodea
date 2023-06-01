package parallel;

import java.awt.AWTException;

import AlphaPages.RegistartionPage;
import alpha.drivers.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RegistrationPagesteps {
	RegistartionPage registartionPage;
	
	
	
	
	@Given("user visits registration form")
	public void user_visits_registration_form() {
		DriverFactory.getDriver().get("https://stageapp.botprise.com/signup/sandbox");
	}

	@Then("user do registration")
	public void user_do_registration() throws InterruptedException, AWTException {
		registartionPage=new RegistartionPage(DriverFactory.getDriver());
		registartionPage.createUser();
	}

	@Then("verifies succesmsg {string}")
	public void verifies_succesmsg(String string) throws InterruptedException {
		registartionPage.verifysuccesmsg(string);
	}
}
