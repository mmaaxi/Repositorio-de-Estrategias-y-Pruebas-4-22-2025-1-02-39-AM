package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc9Page {

    private WebDriver driver;

    // Locators
    private By actionILocator = By.id("ACTION_I_ELEMENT_ID");
    private By resultILocator = By.id("RESULT_I_ELEMENT_ID");

    public tc9Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performActionI() {
        driver.findElement(actionILocator).click();
    }

    public boolean isResultIDisplayed() {
        return driver.findElement(resultILocator).isDisplayed();
    }
}