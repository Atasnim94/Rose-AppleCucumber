package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.iPad;

public class iPadSteps {


    private static final Logger LOGGER = LogManager.getLogger(iPadSteps.class);
    WebDriver driver = Hooks.driver;


    @When("^user click on iPad Button$")
    public void clickOniPadButton() {
        new iPad(driver)
                .ClickOniPadButton();

    }

    @And("^click on iPad Air button$")
    public void clickOniPadAir() {
        new iPad(driver)
                .ClickOniPadAirButton();
    }

    @Then("^user landed on iPad Air page$")
    public void validateMacBookAirPageSuccessfully() {
        new iPad(driver)
                .ValidationiPadAirPage();
    }
}

