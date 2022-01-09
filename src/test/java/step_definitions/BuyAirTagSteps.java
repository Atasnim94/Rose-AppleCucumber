package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.BuyAirTag;


public class BuyAirTagSteps {
    private static final Logger LOGGER = LogManager.getLogger(BuyAirPodsSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^user click on Buy iPhone Button$")
    public void clickOnBuyiPhoneButton() {
        new BuyAirTag(driver)
                .ClickOnBuyiPhoneButton();

    }

    @And("^user click on AirTag Button$")
    public void ClickOnAirTagButton() {
        new BuyAirTag(driver)
                .ClickOnAirTagButton();

    }
    @And("^user landed on AirTag page and user click on Buy$")
    public void clickOnBuy() {
        new BuyAirTag(driver)
                .ClickOnAirTagBuyButton();
    }

    @Then("^User land on Buy AirTag Page$")
    public void validateAirTagBagPageSuccessfully() {
        new BuyAirTag(driver)
                .ValidationBuyAirTagBagPage();
    }
}


