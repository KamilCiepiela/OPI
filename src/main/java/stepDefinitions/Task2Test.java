package stepDefinitions;

import Pages.BlousePage;
import Pages.CreateAccountPage;
import Pages.LoginPage;
import Pages.MainPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2Test {
    private WebDriver driver;
    private String username = "someusername@example.org";
    private String password = "password";

    @Before
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("the user does not have a valid account")
    public void user_does_not_have_valid_account() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);

        Assert.assertTrue(loginPage.getAuthenticationErrorMessage().equals("Authentication failed."));

        loginPage.enterNewUsername(username);
    }

    @When("the user is able to registreate")
    public void user_able_to_registreate() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterNewUsername(username);
        loginPage.clickCreateButton();

        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        Assert.assertTrue(createAccountPage.getcreateAccountMessage().equals("Create an account"));
    }

    @Then("the user should be able to create an account")
    public void user_should_create_account() {
        //fill all the fields marked in CreateAccountPage
        //click Register button
        //assert that new account have been created
    }

    @Given("the user is on the login page")
    public void user_on_login_page() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.getAuthenticationTitle().equals("Authentication"));

    }

    @When("the user enters valid credentials")
    public void user_enters_valid_credentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();

        //assertion login has been successful
    }

    @Then("the user should be able to view account")
    public void user_should_view_account() {
        //create object of a page after login
        //assert that login has been successful
    }

    @Given("the user is logged")
    public void user_is_logged() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.getAuthenticationTitle().equals("Authentication"));

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();

        //assertion login has been successful
    }

    @When("the user sees the products list")
    public void user_sees_product_list() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.getAutomationPracticeString().equals("Automation Practice Website"));

        mainPage.clickBlousePicture();

        BlousePage blousePage = new BlousePage(driver);
        Assert.assertTrue(blousePage.getBlouseDescription().equals("Short sleeved blouse with feminine draped sleeve detail."));
    }

    @Then("the user should be able to add a product to the basket")
    public void user_should_add_product_to_basket() {
        BlousePage blousePage = new BlousePage(driver);
        blousePage.clickAddToCartButton();

        Assert.assertTrue(blousePage.getProductAddedMessage().equals("Product successfully added to your shopping cart"));
    }
}