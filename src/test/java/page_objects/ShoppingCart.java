package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCart extends NavigationBar{
    private static final By ShoppingCartButton = By.xpath("//*[@data-string-badge='Shopping Bag with item count : {%BAGITEMCOUNT%}']");
    private static final By OrdertButton = By.xpath("//*[@id=\"ac-gn-bagview-content\"]/nav/ul/li[3]/a");
    private static final By FindYourOrderPage = By.xpath("//*[@id=\"signin-container\"]");


    private static final Logger LOGGER = LogManager.getLogger(ShoppingCart.class);

    public ShoppingCart(WebDriver driver) {super(driver);}


    public ShoppingCart ClickOnShoppingCartButton () {
        LOGGER.debug("user click on Shopping Cart Button");
        ActOn.element(driver, ShoppingCartButton).click();
        return this;
    }
    public ShoppingCart ClickOnOrderButton () {
        LOGGER.debug("user click on Order Button");
        ActOn.element(driver, OrdertButton).click();
        return this;
    }
    public  ShoppingCart ValidationFindYourOrderPage() {
        LOGGER.debug("ValidateFindYourOrderPage");
        boolean CheckFindYourOrderPageValidation = driver.findElement(FindYourOrderPage).isDisplayed();
        Assert.assertTrue("Find Your Order page name is Displayed on the page", CheckFindYourOrderPageValidation);
        return this;
    }


}


