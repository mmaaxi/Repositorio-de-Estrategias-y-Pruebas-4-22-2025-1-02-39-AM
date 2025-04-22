package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc7Page {

    WebDriver driver;

    // By locators
    By actionGLocator = By.id("action-g");
    By resultGLocator = By.id("result-g");

    // Constructor
    public tc7Page(WebDriver driver) {
        this.driver = driver;
    }

    // Method to perform action G
    public void executeActionG() {
        driver.findElement(actionGLocator).click();
    }

    // Method to verify expected result G
    public boolean isExpectedResultGDisplayed() {
        return driver.findElement(resultGLocator).isDisplayed();
    }
}