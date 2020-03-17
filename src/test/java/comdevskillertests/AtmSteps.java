package comdevskillertests;

import comdevskillertests.AtmService;
import comdevskillertests.AtmServiceProvider;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AtmSteps {
	String cardNumber=null;
	String validationMessage=null;

	AtmService atmService = AtmServiceProvider.getAtmService();
	@Given("^User has valid card \"([^\"]*)\" and also have balance on his account$")
	public void user_has_valid_card_and_also_have_balance_on_his_account(String cardNumber) {
	    // Write code here that turns the phrase above into concrete actions
		atmService.deposit(cardNumber, 1000);
		this.cardNumber=cardNumber;
	}

	@When("^User enter the amount \"([^\"]*)\"$")
	public void user_enter_the_amount(String amount) {
	    // Write code here that turns the phrase above into concrete actions
		validationMessage=atmService.withdraw(cardNumber, Integer.parseInt(amount));
	}

	@Then("a validation message will display for the negative amount")
	public void a_validation_message_will_display_for_the_negative_amount() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println(validationMessage);
	}
}