package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
        PageFactory.initElements(factory, this);
    }

    @FindBy(id = "email")
    WebElement usernameInput;

    @FindBy(name = "passwd")
    WebElement passwordInput;

    @FindBy(id = "SubmitLogin")
    WebElement loginButton;

    @FindBy(id = "email_create")
    WebElement newUsernameInput;

    @FindBy(id = "SubmitCreate")
    WebElement createButton;

    @FindBy(xpath = "//li[contains(text(),'Authentication failed.')]")
    WebElement authenticationErrorMessage;

    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement authenticationTitle;


    public void enterUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void enterNewUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void clickCreateButton() {
        createButton.click();
    }

    public String getAuthenticationErrorMessage() {
        String text = authenticationErrorMessage.getText();
        return text;
    }

    public String getAuthenticationTitle() {
        String text = authenticationTitle.getText();
        return text;
    }
}
