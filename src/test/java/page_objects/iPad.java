package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class iPad extends NavigationBar {
    private static final By iPadButton = By.xpath("//*[@href='/ipad/']");
    private static final By iPadAir = By.xpath("//*[@id=\"chapternav\"]/div/ul/li[2]/a/figure");
    private static final By iPadAirPage = By.xpath("//a[normalize-space()='iPad Air']");

    private static final Logger LOGGER = LogManager.getLogger(iPad.class);

    public iPad (WebDriver driver) {
        super(driver);
    }

        public iPad ClickOniPadButton () {
            LOGGER.debug("user click on iPad Button");
            ActOn.element(driver, iPadButton).click();
            return this;
        }
    public iPad ClickOniPadAirButton () {
        LOGGER.debug("user click on iPad Air Button");
        ActOn.element(driver, iPadAir).click();
        return this;
    }
    public  iPad ValidationiPadAirPage() {
        LOGGER.debug("ValidateiPadAirPage");
        boolean CheckiPadAirValidation = driver.findElement(iPadAirPage).isDisplayed();
        Assert.assertTrue("iPadAir page name is Displayed on the page", CheckiPadAirValidation);
        return this;
    }




    }
