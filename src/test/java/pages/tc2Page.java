package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc2Page {
    WebDriver driver;

    By actionBButton = By.id("actionB");
    By expectedResultB = By.id("resultB");

    public tc2Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performActionB() {
        WebElement button = driver.findElement(actionBButton);
        button.click();
    }

    public boolean isResultBDisplayed() {
        WebElement result = driver.findElement(expectedResultB);
        return result.isDisplayed();
    }
}