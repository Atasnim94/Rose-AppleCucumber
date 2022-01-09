package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.MacBook;
import utilities.ReadConfigFiles;


public class MacBookSteps {

    private static final Logger LOGGER = LogManager.getLogger(MacBookSteps.class);
    WebDriver driver = Hooks.driver;

    @Given("^a user is on the home page$")
    public void navigateToHomePage() {
        String url = ReadConfigFiles.getPropertyValues("AppleURL");
        ActOn.browser(driver).openBrowser(url);
        LOGGER.info("User is on the home page");
    }
    @When("^user click on Mac Button$")
    public void clickOnMacButton() {
       new MacBook(driver)
               .ClickOnMacButton();
    }
    @And("^click on MacBook Air button$")
    public void clickOnMacBookAir() {
        new MacBook(driver)
                .ClickOnMacBookAir();
    }
    @Then("^user landed on MacBook Air page$")
    public void validateMacBookAirPageSuccessfully() {
        new MacBook(driver)
                .ValidationMacBookAirPage();

    }

}
