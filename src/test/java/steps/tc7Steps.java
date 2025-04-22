package steps;

import pages.tc7Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class tc7Steps {

    tc7Page page = new tc7Page();

    @Given("I perform action G")
    public void i_perform_action_g() {
        page.executeActionG();
    }

    @Then("I should see the expected result G")
    public void i_should_see_the_expected_result_g() {
        assertTrue(page.isExpectedResultGDisplayed());
    }
}