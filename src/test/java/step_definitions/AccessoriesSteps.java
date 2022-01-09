package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.Accessories;

public class AccessoriesSteps {
    private static final Logger LOGGER = LogManager.getLogger(AccessoriesSteps.class);
    WebDriver driver = Hooks.driver;


    @When("^user click on Accessories Button$")
    public void clickOnAccessoriesButton() {
        new Accessories(driver)
                .ClickOnAccessoriesButton();
    }

    @And("^user is able to click on BrowseAll$")
    public void clickOnBrowseAll() {
        new Accessories(driver)
                .ClickOnBrowseAll();

    }
    @And("^user is able to click on Cases$")
    public void clickOnCases() {
        new Accessories(driver)
                .ClickOnCases();
    }
    @And("^user is able to click on Silicone Case$")
    public void clickOnSiliconeCases() {
        new Accessories(driver)
                .ClickOnSiliconeCase();
    }
    @And("^user is able to choose Red Color$")
    public void ClickOnRedColor() {
        new Accessories(driver)
                .ClickOnRedColor();
    }
    @And("^user is able to click Add to Bag$")
    public void ClickOnAddToBag() {
        new Accessories(driver)
                .ClickOnAddToBag();
    }
    @And("^user is able to click on CheckOut Button$")
    public void ClickOnCheckOut() {
        new Accessories(driver)
                .ClickOnCheckOut();
    }
    @Then("^User land on Checkout Page$")
    public void ValidateCheckOutpageSuccessfully () {
        new Accessories(driver)
                .ValidationCheckOutpage();

    }
}


