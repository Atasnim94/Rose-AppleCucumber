package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MacBook extends NavigationBar {
    private static final By MacButton = By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[3]/a");
    private static final By MacBookAir = By.xpath("//*[@id=\"chapternav\"]/div/ul/li[1]/a/span");
    private static final By MacBookAirPage = By.xpath("//*[@id=\"ac-localnav\"]/div/div[2]/div[1]/a");

    private static final Logger LOGGER = LogManager.getLogger(MacBook.class);

    public MacBook(WebDriver driver) {
        super(driver);
    }

    public MacBook ClickOnMacButton () {
        LOGGER.debug("user click on Mac Button");
        ActOn.element(driver, MacButton).click();
        return this;
    }

    public  MacBook ClickOnMacBookAir(){
        LOGGER.debug("click on MacBook Air button");
        ActOn.element(driver, MacBookAir).click();
        return this;
    }

    public  MacBook ValidationMacBookAirPage() {
        LOGGER.debug("ValidateMacBookAirPage");
        boolean checkMacBookAirValidation = driver.findElement(MacBookAirPage).isDisplayed();
        Assert.assertTrue("MacBookAir name is Displayed on the page", checkMacBookAirValidation);
        return this;
    }
}
