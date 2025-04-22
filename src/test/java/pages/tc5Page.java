package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc5Page {
    WebDriver driver;

    // Locators
    By actionEButton = By.id("actionEButton");
    By resultText = By.id("resultText");

    public tc5Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performActionE() {
        driver.findElement(actionEButton).click();
    }

    public String getResult() {
        return driver.findElement(resultText).getText();
    }
}