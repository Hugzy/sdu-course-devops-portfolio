import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dk.magida.bankingsolution.Account;
import dk.magida.bankingsolution.AutomatedTellerMachine;
import dk.magida.bankingsolution.ResponseObject;

import static junit.framework.TestCase.assertEquals;

public class StepDefinition {
    Account acc = new Account();
    ResponseObject response;

    @Given("^I have an account with a balance of (\\d+)$")
    public void iHaveAnAccountWithABalanceOf(int balance) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        acc.setBalance(balance);
    }

    @When("^I make a deposit of (\\d+) at an ATM$")
    public void iMakeADepositOfAtAnATM(int deposit) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        AutomatedTellerMachine atm = new AutomatedTellerMachine();
        response = atm.makeDeposit(acc, deposit);
    }

    @Then("^The ATM displays message that deposit was successful$")
    public void theATMDisplaysMessageThatDepositWasSuccessful() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(response.getResponseCode(), 0);
    }

    @And("^My account has a new balance of (\\d+)$")
    public void myAccountHasANewBalanceOf(int balance) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(acc.getBalance(), balance);
    }

    @When("^I make a withdrawal of (\\d+) at an ATM$")
    public void iMakeAWithdrawalOfAtAnATM(int withdrawal) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        AutomatedTellerMachine atm = new AutomatedTellerMachine();
        response = atm.makeWithdrawal(acc, withdrawal);
    }

    @Then("^The ATM displays message that withdrawal was successful$")
    public void theATMDisplaysMessageThatWithdrawalWasSuccessful() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(response.getResponseCode(), 0);
    }
}
