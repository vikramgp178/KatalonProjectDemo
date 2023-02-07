import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginTestCode {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user is on login screen")
	public void user_is_on_login_screen() {
		// Write code here that turns the phrase above into concrete actions
		println("user is on login page");
		WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login', FailureHandling.STOP_ON_FAILURE)
	}
	
	/*
	 * @When("user enters the valid <username> and <password>") public void
	 * user_enters_the_valid_Admin_and_admin(String username, String password) {
	 * println("enters valid credentials using scenario outline");
	 * WebUI.setText(findTestObject('Object
	 * Repository/02_Orange_HRM/Page_OrangeHRM/input_Username_username'), username,
	 * FailureHandling.STOP_ON_FAILURE) WebUI.setText(findTestObject('Object
	 * Repository/02_Orange_HRM/Page_OrangeHRM/input_Password_password'), password,
	 * FailureHandling.STOP_ON_FAILURE) }
	 */

	@When("user enters the valid username and password")
	public void user_enters_the_valid_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		println("enters valid credentials");
		WebUI.setText(findTestObject('Object Repository/02_Orange_HRM/Page_OrangeHRM/input_Username_username'), 'Admin', FailureHandling.STOP_ON_FAILURE)

		WebUI.setEncryptedText(findTestObject('Object Repository/02_Orange_HRM/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==',
				FailureHandling.STOP_ON_FAILURE)


	}
	
	@When("user enters the valid (.*) and (.*) test")
	public void user_enters_the_valid_username_and_password_test(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		println("enters valid credentials using scenario outline");
		WebUI.setText(findTestObject('Object Repository/02_Orange_HRM/Page_OrangeHRM/input_Username_username'), username, FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/02_Orange_HRM/Page_OrangeHRM/input_Password_password'), password, FailureHandling.STOP_ON_FAILURE)
	
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		println("clicked on login button");
		WebUI.click(findTestObject('Object Repository/02_Orange_HRM/Page_OrangeHRM/button_Login'))


	}

	@Then("user navigated to homepage")
	public void user_navigated_to_homepage() {
		// Write code here that turns the phrase above into concrete actions
		println("user on home page");
		WebUI.verifyTextPresent('Dashboard', false, FailureHandling.STOP_ON_FAILURE)

		WebUI.closeBrowser()
	}
	
	
	
}