package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc6Page;

public class tc6Steps {
    WebDriver driver;
    tc6Page page;

    public tc6Steps() {
        this.driver = Hooks.driver;
        page = new tc6Page(driver);
    }

    @Given("I am on the initial page")
    public void i_am_on_the_initial_page() {
        driver.get("https://example.com"); // replace with actual URL
    }
  
    @When("I execute action F")
    public void i_execute_action_F() {
        page.performActionF();
    }

    @Then("I should see the expected result F")
    public void i_should_see_the_expected_result_F() {
        page.verifyExpectedResultF();
    }
}