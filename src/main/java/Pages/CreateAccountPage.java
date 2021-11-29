package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CreateAccountPage {
    WebDriver driver;

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
        PageFactory.initElements(factory, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Create an account')]")
    WebElement createAccountMessage;

    public String getcreateAccountMessage() {
        String text = createAccountMessage.getText();
        return text;
    }


}
