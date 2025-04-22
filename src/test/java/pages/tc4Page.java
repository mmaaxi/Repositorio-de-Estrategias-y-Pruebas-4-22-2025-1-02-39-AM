package pages;

import org.openqa.selenium.WebDriver;

public class tc4Page {

    WebDriver driver;

    public tc4Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToPage() {
        driver.get("http://example.com/specificPage");
    }

    public void performActionD() {
        // Code to execute action D
    }

    public void verifyExpectedResultD() {
        // Code to verify the expected result D
    }
}