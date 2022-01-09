package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.AirPods;
import page_objects.Watch;

public class AirPodsSteps {
    private static final Logger LOGGER = LogManager.getLogger(AirPods.class);
    WebDriver driver = Hooks.driver;

    @When("^user click on AirPods Button$")
    public void clickOnAirPodsButton() {
        new AirPods(driver)
                .ClickOnAirPodsButton();

    }

    @And("^click on AirPods Pro Button$")
    public void clickOnAirPodsProButton() {
        new AirPods(driver)
                .ClickOnAirPodsProButton();
    }
    @Then("^user landed on AirPods Pro page$")
    public void validateAirPodsProPageSuccessfully() {
        new AirPods(driver)
                .ValidationAirPodsProPage();

    }
}

