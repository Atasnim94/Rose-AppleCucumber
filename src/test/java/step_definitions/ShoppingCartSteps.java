package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.ShoppingCart;
import page_objects.iPhone;

public class ShoppingCartSteps {
    private static final Logger LOGGER = LogManager.getLogger(ShoppingCart.class);
    WebDriver driver = Hooks.driver;

    @When("^user click on Shopping Cart Button$")
    public void clickOnShoppingCart() {
        new ShoppingCart(driver)
                .ClickOnShoppingCartButton();
    }

    @And("^click on Orders Button$")
    public void clickOnOrderButton() {
        new ShoppingCart(driver)
                .ClickOnOrderButton();

    }

    @Then("^user landed on Find Your Orders page$")
    public void validateFindYourOrderPageSuccessfully() {
        new ShoppingCart(driver)
                .ValidationFindYourOrderPage();

    }
}



