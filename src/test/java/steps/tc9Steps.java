package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc9Page;
import static org.junit.Assert.assertTrue;

public class tc9Steps {

    private WebDriver driver;
    private tc9Page page;

    @Given("the user is on the initial page")
    public void the_user_is_on_the_initial_page() {
        driver = new ChromeDriver();
        page = new tc9Page(driver);
        driver.get("URL_OF_THE_INITIAL_PAGE");
    }

    @When("the user performs Action I")
    public void the_user_performs_action_i() {
        page.performActionI();
    }

    @Then("the Result I should be displayed")
    public void the_result_i_should_be_displayed() {
        assertTrue(page.isResultIDisplayed());
        driver.quit();
    }
}