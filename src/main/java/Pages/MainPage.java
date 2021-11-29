package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class MainPage {

    WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
        PageFactory.initElements(factory, this);
    }

    @FindBy(className = "login")
    WebElement singInButton;

    @FindBy(linkText = "http://automationpractice.com/img/p/7/7-home_default.jpg")
    WebElement blousePicture;

    @FindBy(xpath = "//h1[contains(text(),'Automation Practice Website')]")
    WebElement automationPracticeString;

    public void clickSigninButton(){
        singInButton.click();
    }

    public void clickBlousePicture(){
        blousePicture.click();
    }

    public String getAutomationPracticeString() {
        String text = automationPracticeString.getText();
        return text;
    }
}
