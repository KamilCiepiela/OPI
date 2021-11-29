package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class BlousePage {

    WebDriver driver;

    public BlousePage(WebDriver driver) {
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
        PageFactory.initElements(factory, this);
    }

    @FindBy(name = "Submit")
    WebElement addToCartButton;

    @FindBy(xpath = "//div[@id='short_description_content']")
    WebElement blouseDescription;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")
    WebElement productAddedMessage;

    public void clickAddToCartButton(){
        addToCartButton.click();
    }

    public String getBlouseDescription() {
        String text = blouseDescription.getText();
        return text;
    }

    public String getProductAddedMessage() {
        String text = productAddedMessage.getText();
        return text;
    }
}
