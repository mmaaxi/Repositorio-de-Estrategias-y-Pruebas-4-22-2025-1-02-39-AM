package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc11Page;

public class tc11Steps {

    private WebDriver driver = new ChromeDriver();
    private tc11Page page = new tc11Page(driver);

    @Given("^the user is on the initial page$")
    public void userIsOnInitialPage() {
        driver.get("http://application-url.com");
    }

    @When("^the user executes action K$")
    public void userExecutesActionK() {
        page.executeActionK();
    }

    @Then("^the system should show the expected result K$")
    public void systemShowsExpectedResultK() {
        Assert.assertTrue(page.isResultKDisplayed());
        driver.quit();
    }
}