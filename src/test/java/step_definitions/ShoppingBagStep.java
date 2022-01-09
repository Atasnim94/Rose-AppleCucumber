package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.ShoppingBag;


public class ShoppingBagStep {
    private static final Logger LOGGER = LogManager.getLogger(ShoppingBag.class);
    WebDriver driver = Hooks.driver;

    @When("^user click on Shopping Bag Button$")
    public void clickOnShoppingBagButton() {
        new ShoppingBag(driver)
                .ClickOnShoppingBagButton();
    }

    @And("^click on Sign In Button$")
    public void clickOnAccountButton() {
        new ShoppingBag(driver)
                .ClickOnSignInButton();

    }

    @Then("^user landed on Sign In page$")
    public void validateSignInPageSuccessfully() {
        new ShoppingBag(driver)
                .ValidationSignInPage();
    }

}
