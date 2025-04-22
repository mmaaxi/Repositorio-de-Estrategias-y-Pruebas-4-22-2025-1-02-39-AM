package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc4Page;

public class tc4Steps {

    WebDriver driver;
    tc4Page page;

    public tc4Steps() {
        driver = Hooks.driver;
        page = PageFactory.initElements(driver, tc4Page.class);
    }

    @Given("I am on the specific page")
    public void iAmOnTheSpecificPage() {
        page.navigateToPage();
    }

    @When("I execute action D")
    public void iExecuteActionD() {
        page.performActionD();
    }

    @Then("I should see the expected result D")
    public void iShouldSeeTheExpectedResultD() {
        page.verifyExpectedResultD();
    }
}