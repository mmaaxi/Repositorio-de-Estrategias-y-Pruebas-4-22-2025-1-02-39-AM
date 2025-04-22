import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc12Page {
    WebDriver driver;

    public tc12Page(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "actionElementL")
    WebElement actionElementL;

    @FindBy(id = "resultElementL")
    WebElement resultElementL;

    public void performActionL() {
        actionElementL.click(); // Example action, clicking an element
    }

    public String getResult() {
        return resultElementL.getText();
    }
}