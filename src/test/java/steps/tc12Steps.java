import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;

public class tc12Steps {
    WebDriver driver;
    tc12Page page;

    public tc12Steps() {
        driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc12Page.class);
    }

    @Given("the application is loaded")
    public void application_is_loaded() {
        // Assume the application is already loaded as part of the test setup
    }

    @When("I execute action L")
    public void execute_action_L() {
        page.performActionL();
    }

    @Then("I should see the expected Result L")
    public void verify_expected_Result_L() {
        String result = page.getResult();
        assertEquals("Resultado esperado L", result);
    }
}