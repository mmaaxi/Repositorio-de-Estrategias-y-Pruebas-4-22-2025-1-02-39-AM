package steps;

import pages.tc10Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc10Steps {

    tc10Page page = new tc10Page();

    @Given("the user is on the desired page")
    public void the_user_is_on_the_desired_page() {
        page.navigateToPage();
    }

    @When("the user performs action J")
    public void the_user_performs_action_J() {
        page.performActionJ();
    }

    @Then("the expected result J is displayed")
    public void the_expected_result_J_is_displayed() {
        assertTrue(page.verifyExpectedResultJ());
    }
}