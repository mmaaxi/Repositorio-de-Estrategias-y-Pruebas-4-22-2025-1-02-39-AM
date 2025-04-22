package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc2Page;
import static org.junit.Assert.*;

public class tc2Steps {
    WebDriver driver = new ChromeDriver();
    tc2Page page = new tc2Page(driver);

    @Given("I am on the relevant page")
    public void i_am_on_the_relevant_page() {
        driver.get("http://example.com");
    }

    @When("I execute action B")
    public void i_execute_action_B() {
        page.performActionB();
    }

    @Then("I should see the expected result B")
    public void i_should_see_the_expected_result_B() {
        assertTrue(page.isResultBDisplayed());
        driver.quit();
    }
}