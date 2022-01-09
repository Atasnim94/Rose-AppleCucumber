package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AirPods extends NavigationBar {
    private static final By AirPodsButton = By.xpath("//*[@data-analytics-title='airpods']");
    private static final By AirPodsProButton = By.xpath("//*[@id=\"chapternav\"]/div/ul/li[3]/a/figure");
    private static final By AirPodsProPage = By.xpath("//*[@data-analytics-title='product index']");

    private static final Logger LOGGER = LogManager.getLogger(AirPods.class);

    public AirPods(WebDriver driver) {super(driver);}

        public AirPods ClickOnAirPodsButton(){
            LOGGER.debug("user click on Airpods Button");
            ActOn.element(driver, AirPodsButton).click();
            return this;
        }
        public AirPods ClickOnAirPodsProButton () {
            LOGGER.debug("user click on AirPods Pro Button");
            ActOn.element(driver, AirPodsProButton).click();
            return this;
        }
        public AirPods ValidationAirPodsProPage () {
            LOGGER.debug("ValidateAirPodsProPage");
            boolean CheckAirPodsProValidation = driver.findElement(AirPodsProPage).isDisplayed();
            Assert.assertTrue("AirPods page name is Displayed on the page", CheckAirPodsProValidation);
            return this;
        }


    }


