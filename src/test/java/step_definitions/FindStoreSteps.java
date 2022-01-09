package step_definitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.FindStore;


public class FindStoreSteps {
    private static final Logger LOGGER = LogManager.getLogger(FindStoreSteps.class);
    WebDriver driver = Hooks.driver;


    @When("^user click on Find A Store Button$")
    public void clickOnFindStoreButton() {
        new FindStore(driver)
                .ClickOnFindStoreButton();

    }

    @Then("^user landed on Find A Store Page$")
    public void validateFindAStorePageSuccessfully() {
        new FindStore(driver)
                .ValidationFindStorePage();
    }
}
