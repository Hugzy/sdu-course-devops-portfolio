import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
    @cucumber.api.java.en.Given("^I have an account with a balance of (\\d+)$")
    public void iHaveAnAccountWithABalanceOf(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("^I make a deposit of (\\d+) at an ATM$")
    public void iMakeADepositOfAtAnATM(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^The ATM displays message that deposit was successful$")
    public void theATMDisplaysMessageThatDepositWasSuccessful() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^My account has a new balance of (\\d+)$")
    public void myAccountHasANewBalanceOf(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
