package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc1Page;

public class tc1Steps {
    WebDriver driver;
    tc1Page page;

    @Given("the user is on the initial page")
    public void the_user_is_on_the_initial_page() {
        driver = new ChromeDriver();
        page = new tc1Page(driver);
        driver.get("initialPageURL"); // replace with your initial page URL
    }

    @When("the user executes action A")
    public void the_user_executes_action_A() {
        page.performActionA();
    }

    @Then("the expected result A should be displayed")
    public void the_expected_result_A_should_be_displayed() {
        // Implement verification logic to check expected result A
        page.verifyResultA();
        driver.quit();
    }
}