package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc11Page {

    private WebDriver driver;
    private By actionKButton = By.id("actionKButton");
    private By expectedResultK = By.id("resultK");

    public tc11Page(WebDriver driver) {
        this.driver = driver;
    }

    public void executeActionK() {
        driver.findElement(actionKButton).click();
    }

    public boolean isResultKDisplayed() {
        return driver.findElement(expectedResultK).isDisplayed();
    }
}