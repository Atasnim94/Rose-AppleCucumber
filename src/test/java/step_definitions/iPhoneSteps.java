package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.iPhone;

public class iPhoneSteps {
    private static final Logger LOGGER = LogManager.getLogger(iPhoneSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^user click on iPhone Button$")
    public void clickOniPhoneButton() {
        new iPhone(driver)
                .ClickOniPhoneButton();
    }

    @And("^click on iPhone 13 button$")
    public void clickOniPhone13() {
        new iPhone(driver)
                .ClickOniPhone13button();

    }

    @Then("^user landed on iPhone 13 page$")
    public void validateiPhone13PageSuccessfully() {
        new iPhone(driver)
                .ValidationiPhone13Page();

    }
}

