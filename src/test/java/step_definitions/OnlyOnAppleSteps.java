package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.OnlyOnApple;

public class OnlyOnAppleSteps {
    private static final Logger LOGGER = LogManager.getLogger(OnlyOnApple.class);
    WebDriver driver = Hooks.driver;

    @When("^user click on Only on Apple Button$")
    public void clickOnOnlyOnAppleButton() {
        new OnlyOnApple(driver)
                .ClickOnOnlyOnAppleButton();
    }
    @And("^click on Apple Music Button$")
    public void clickOnAppleMusicButton() {
        new OnlyOnApple(driver)
                .ClickOnAppleMusicButton();
    }
    @Then("^user landed on Apple Music page$")
    public void validateAppleMusicPageSuccessfully() {
        new OnlyOnApple(driver)
                .ValidationAppleMusicPage();

    }
}

