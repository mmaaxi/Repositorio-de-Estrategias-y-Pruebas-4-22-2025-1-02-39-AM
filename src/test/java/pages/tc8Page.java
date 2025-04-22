package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class tc8Page {
    WebDriver driver;

    // Replace with actual driver initialization or injection
    public tc8Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Define the element locators
    By actionHButton = By.id("actionHButton");
    By expectedResultH = By.id("expectedResultH");

    public void navigateToInitialPage() {
        driver.get("http://example.com/initialpage");
    }

    public void performActionH() {
        WebElement actionButton = driver.findElement(actionHButton);
        actionButton.click();
    }

    public boolean isExpectedResultHDisplayed() {
        WebElement resultElement = driver.findElement(expectedResultH);
        return resultElement.isDisplayed();
    }
}