package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.Watch;
import page_objects.iPhone;

public class WatchSteps {
    private static final Logger LOGGER = LogManager.getLogger(WatchSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^user click on Watch Button$")
    public void clickOnWatchButton() {
        new Watch(driver)
                .ClickOnWatchButton();
    }

    @And("^click on Apple Watch7 button$")
    public void clickOnBandsButton() {
        new Watch(driver)
                .ClickOnAppleWatch7Button();
    }
    @Then("^user landed on Apple Watch7 page$")
    public void validateBandPageSuccessfully() {
        new Watch(driver)
                .ValidationAppleWatch7Page();

    }
}


