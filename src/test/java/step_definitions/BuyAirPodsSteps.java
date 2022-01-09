package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.AirPods;
import page_objects.BuyAirPods;
import page_objects.iPhone;

public class BuyAirPodsSteps {
    private static final Logger LOGGER = LogManager.getLogger(BuyAirPodsSteps.class);
    WebDriver driver = Hooks.driver;


    @When("^user click on Buy AirPods Button$")
    public void clickOnAirPodsButton() {
        new BuyAirPods(driver)
                .ClickOnBuyAirPodsButton();
    }

    @And("^user click on Airpods 3rd Generation$")
    public void clickOnAirPods3rdGeneration() {
        new BuyAirPods(driver)
                .ClickOnAirPods3rdGenerationbutton();

    }
    @And("^user landed on Airpods 3rd generation page and user click on Buy$")
    public void clickOnBuyButton() {
        new BuyAirPods(driver)
                .ClickOnBuyButton();
    }
    @And("^user is able to see add to bag and click on add to bag button$")
    public void clickOnAddToBag() {
        new BuyAirPods(driver)
                .ClickOnAddToBagbutton();
    }
    @Then("^user land on Review Your Bag page$")
    public void validateReviewYourBagPageSuccessfully () {
        new BuyAirPods(driver)
                .ValidationReviewBagPage();

        }
    }
