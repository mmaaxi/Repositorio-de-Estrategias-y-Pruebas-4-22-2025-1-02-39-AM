package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.Assert;

public class tc3Page {
    WebDriver driver;

    // Locators
    By actionCLocator = By.id("actionCButton");
    By resultCLocator = By.id("resultCText");

    public tc3Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performActionC() {
        WebElement actionButton = driver.findElement(actionCLocator);
        actionButton.click();
    }

    public void verifyResultC() {
        WebElement resultText = driver.findElement(resultCLocator);
        Assert.assertTrue("Result C is not displayed!", resultText.isDisplayed());
    }
}