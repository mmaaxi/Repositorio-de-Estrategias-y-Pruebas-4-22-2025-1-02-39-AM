package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc5Page;

public class tc5Steps {
    WebDriver driver;
    tc5Page page;

    @Given("I am on the starting page")
    public void i_am_on_the_starting_page() {
        driver = new ChromeDriver();
        page = new tc5Page(driver);
        driver.get("http://example.com"); // Replace with actual URL
    }

    @When("I execute action E")
    public void i_execute_action_e() {
        page.performActionE();
    }

    @Then("I should see the expected result E")
    public void i_should_see_the_expected_result_e() {
        String result = page.getResult();
        assertEquals("Expected Result E", result);
        driver.quit();
    }
}