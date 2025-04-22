package steps;

import pages.tc8Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc8Steps {
    tc8Page page = new tc8Page();

    @Given("I am on the initial page")
    public void i_am_on_the_initial_page() {
        page.navigateToInitialPage();
    }

    @When("I execute action H")
    public void i_execute_action_H() {
        page.performActionH();
    }

    @Then("I should see the expected result H")
    public void i_should_see_the_expected_result_H() {
        assertTrue(page.isExpectedResultHDisplayed());
    }
}