package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.TV;

public class TVSteps {
    private static final Logger LOGGER = LogManager.getLogger(TVSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^user click on TV Button$")
    public void clickOnTVButton() {
        new TV(driver)
                .ClickOnTVButton();
    }

    @And("^click on Apple TV 4K Button$")
    public void clickOnAppleTV4KButton() {
        new TV(driver)
                .ClickOnAppleTV4KButton();

    }

    @Then("^user landed on Apple TV 4K page$")
    public void validateAppleTV4KPageSuccessfully() {
        new TV(driver)
                .ValidationAppleTV4KPage();

    }
}

