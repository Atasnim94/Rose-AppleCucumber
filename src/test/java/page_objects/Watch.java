package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Watch extends NavigationBar{
    private static final By WatchButton = By.xpath("//*[@data-analytics-title='watch']");
    private static final By AppleWatch7 = By.xpath("//*[@id=\"chapternav\"]/div/ul/li[1]/a/figure");
    private static final By AppleWatch7Page = By.xpath("//*[@data-analytics-title='product index']");

    private static final Logger LOGGER = LogManager.getLogger(Watch.class);

    public Watch(WebDriver driver) {
        super(driver);
    }

       public Watch ClickOnWatchButton(){
            LOGGER.debug("user click on Watch Button");
            ActOn.element(driver, WatchButton).click();
            return this;
        }
        public Watch ClickOnAppleWatch7Button () {
            LOGGER.debug("user click on Apple Watch S7 Button");
            ActOn.element(driver, AppleWatch7).click();
            return this;
        }
        public  Watch ValidationAppleWatch7Page () {
            LOGGER.debug("ValidateAppleWatch7Page");
            boolean CheckAppleWatch7Validation = driver.findElement(AppleWatch7Page).isDisplayed();
            Assert.assertTrue("Watch page name is Displayed on the page", CheckAppleWatch7Validation);
            return this;
        }


    }

