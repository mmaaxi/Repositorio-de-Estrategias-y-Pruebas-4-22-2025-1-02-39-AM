package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc1Page {
    WebDriver driver;

    // Add locators for elements related to action A and result A
    By actionAButton = By.id("actionAButton"); // example locator
    By resultAText = By.id("resultAText");     // example locator

    public tc1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performActionA() {
        driver.findElement(actionAButton).click();
    }

    public void verifyResultA() {
        // Implement the logic to verify that result A is displayed
        boolean isResultDisplayed = driver.findElement(resultAText).isDisplayed();
        if (!isResultDisplayed) {
            throw new AssertionError("Result A was not displayed");
        }
    }
}