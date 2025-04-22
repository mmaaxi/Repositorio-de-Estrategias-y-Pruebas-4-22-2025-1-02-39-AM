package steps;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.tc3Page;

public class tc3Steps {
    WebDriver driver;
    tc3Page page;

    public tc3Steps() {
        this.driver = Hooks.getDriver();
        this.page = new tc3Page(driver);
    }

    @When("^I perform Action C$")
    public void iPerformActionC() {
        page.performActionC();
    }

    @Then("^I should see Result C$")
    public void iShouldSeeResultC() {
        page.verifyResultC();
    }
}