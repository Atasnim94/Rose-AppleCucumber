package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingBag extends NavigationBar{
    private static final By ShoppingBagButton = By.xpath("//*[@id=\"ac-gn-bag\"]/div/a");
    private static final By SignInButton = By.xpath("//*[@id=\"ac-gn-bagview-content\"]/nav/ul/li[5]/a");
    private static final By SignInPage = By.xpath("(//div[@id='signin-container'])[1]");

    private static final Logger LOGGER = LogManager.getLogger(ShoppingBag.class);

    public ShoppingBag(WebDriver driver) {super(driver);}

    public ShoppingBag ClickOnShoppingBagButton () {
        LOGGER.debug("user click on Shopping Bag Button");
        ActOn.element(driver, ShoppingBagButton).click();
        return this;
    }
    public ShoppingBag ClickOnSignInButton () {
        LOGGER.debug("user click on Account Button");
        ActOn.element(driver, SignInButton).click();
        return this;
    }
    public  ShoppingBag ValidationSignInPage() {
        LOGGER.debug("ValidateSignInPage");
        boolean CheckSignInValidation = driver.findElement(SignInPage).isDisplayed();
        Assert.assertTrue("Sign In Page name is Displayed on the page", CheckSignInValidation);
        return this;
    }

}

