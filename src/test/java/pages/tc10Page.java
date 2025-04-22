package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc10Page {

    WebDriver driver;

    private By actionJButton = By.id("actionJButton");
    private By expectedResultJLabel = By.id("expectedResultJLabel");

    public tc10Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToPage() {
        driver.get("http://example.com/page");
    }

    public void performActionJ() {
        WebElement button = driver.findElement(actionJButton);
        button.click();
    }

    public boolean verifyExpectedResultJ() {
        WebElement resultLabel = driver.findElement(expectedResultJLabel);
        return resultLabel.isDisplayed() && resultLabel.getText().equals("Expected Result J");
    }
}