package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.TVAndHome;


public class TVAndHomeSTEPS {
    private static final Logger LOGGER = LogManager.getLogger(TVAndHome.class);
    WebDriver driver = Hooks.driver;

    @When("^user click on TVAndHome Button$")
    public void clickOnTVAndHomeButton() {
        new TVAndHome(driver)
                .ClickOnTVAndHomeButton();
    }

    @And("^click on Apple TV App Button$")
    public void clickOnAppleTVAppButton() {
        new TVAndHome(driver)
                .ClickOnAppleTVAppButton();

    }

    @Then("^user landed on Apple TV App page$")
    public void validateAppleTVAppPageSuccessfully() {
        new TVAndHome(driver)
                .ValidationAppleTVAppPage();

    }
}
