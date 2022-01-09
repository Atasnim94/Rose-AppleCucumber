package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TVAndHome extends NavigationBar{

    private static final By TVAndHomeButton = By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[8]/a");
    private static final By AppleTVAppButton = By.xpath("//*[@id=\"chapternav\"]/div/ul/li[3]/a/figure");
    private static final By AppleTVAppPage = By.xpath("//*[@id=\"ac-localnav\"]/div/div[2]");

    private static final Logger LOGGER = LogManager.getLogger(TVAndHome.class);

    public TVAndHome(WebDriver driver) {
        super(driver);

        }
        public TVAndHome ClickOnTVAndHomeButton () {
            LOGGER.debug("user click on TVAndHome Button");
            ActOn.element(driver, TVAndHomeButton).click();
            return this;
        }
        public TVAndHome ClickOnAppleTVAppButton () {
            LOGGER.debug("click on Apple TV App Button");
            ActOn.element(driver, AppleTVAppButton).click();
            return this;
        }
        public  TVAndHome ValidationAppleTVAppPage() {
            LOGGER.debug("ValidateAppleTVAppPage");
            boolean CheckAppleTVAppPageValidation = driver.findElement(AppleTVAppPage).isDisplayed();
            Assert.assertTrue("Apple TV App page name is Displayed on the page", CheckAppleTVAppPageValidation);
            return this;
        }

    }

