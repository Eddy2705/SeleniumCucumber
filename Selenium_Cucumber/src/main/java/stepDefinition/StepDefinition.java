package stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.apparel.qa.base.BasePage;
import com.apparel.qa.pages.ContactUs;
import com.apparel.qa.testData.readExcel;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinition extends BasePage {

	ContactUs cs = new ContactUs();

//	USE BELOW CODE FOR TEST1
// TEST1
//	@Given("User is already on ContactUs page")
//	public void user_is_already_on_ContactUs_page() {
//		initialize();
//		driver.get("http://automationpractice.com/index.php?controller=contact");
//		System.out.println("User landed in Contact Us page");
//
//	}
//
//	@When("User selects the dropdown <{string}>")
//	public void user_selects_the_dropdown_value(String dropDown) {
//		cs.subjectHeadingDropdownClick();
//		cs.subjectHeadingDropdown(dropDown);
//	}
//
//	@When("User provides the details like <{string}> and <{string}> and <{string}>")
//	public void user_provides_the_details_required(String email, String orderID, String message) {
//		cs.eMailTextbox(email);
//		cs.orderTextbox(orderID);
//		cs.messageTextbox(message);
//	}
//
//	@When("User clicks on Send button")
//	public void user_clicks_on_Send_Button() {
//		cs.submitBtn();
//		System.out.println("Submit");
//	}
// TEST1	
	
//	USE BELOW CODE FOR TEST2
// TEST2
	
//	@Given("^User is already on ContactUs page$")
//	public void user_is_already_on_ContactUs_page() {
//		initialize();
//		driver.get("http://automationpractice.com/index.php?controller=contact");
//		System.out.println("User landed in Contact Us page");
//
//	}
//
//	@When("^User selects the dropdown \"([^\"]*)\"$")
//	public void user_selects_the_dropdown_value(String drpValue) {
//		cs.subjectHeadingDropdownClick();
//		cs.subjectHeadingDropdown(drpValue);
//	}
//
//	@When("^User provides the details like \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_provides_the_details_required(String email, String orderID, String message) {
//		cs.eMailTextbox(email);
//		cs.orderTextbox(orderID);
//		cs.messageTextbox(message);
//	}
//
//	@When("^User clicks on Send button$")
//	public void user_clicks_on_Send_Button() {
//		cs.submitBtn();
//		System.out.println("Submit");
//	}
//	TEST2
	
	
//	USE BELOW CODE FOR TEST3
// TEST3
	
	@Given("User is already on ContactUs page")
	public void user_is_already_on_ContactUs_page() {
		initialize();
		driver.get("http://automationpractice.com/index.php?controller=contact");
		System.out.println("User landed in Contact Us page");
	}
	
	@When("User inputs data using {string} and {int}")
	public void user_inputs_data_using_and(String sheetName, int rowNum) throws IOException {
		
		readExcel excelData = new readExcel();
		List<Map<String, String>> readExcelData = excelData.readExcelData(sheetName, rowNum);
		String drpValue = readExcelData.get(0).get("Subject_Heading");
		String email = readExcelData.get(0).get("Email_Address");
		String orderID = readExcelData.get(0).get("Order_Reference");
		String message = readExcelData.get(0).get("Message");
		
		cs.subjectHeadingDropdownClick();
		cs.subjectHeadingDropdown(drpValue);
		cs.eMailTextbox(email);
		cs.orderTextbox(orderID);
		cs.messageTextbox(message);
	}

	@And("User clicks on Send button")
	public void user_clicks_on_Send_Button() {
		cs.submitBtn();
		System.out.println("Submit");
	}
//	TEST3
}

