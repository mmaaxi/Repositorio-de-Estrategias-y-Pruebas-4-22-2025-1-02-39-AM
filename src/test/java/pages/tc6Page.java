package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc6Page {
    WebDriver driver;
    WebDriverWait wait;
    By actionFButton = By.id("actionFButton"); // replace with actual selector
    By expectedResultF = By.id("resultF"); // replace with actual selector

    public tc6Page(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void performActionF() {
        driver.findElement(actionFButton).click();
    }

    public void verifyExpectedResultF() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(expectedResultF));
        assert driver.findElement(expectedResultF).isDisplayed();
    }
}