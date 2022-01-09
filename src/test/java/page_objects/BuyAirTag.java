package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyAirTag extends NavigationBar{
    private static final By BuyiPhoneButton = By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[5]/a");
    private static final By AirTagButton = By.xpath("//*[@id=\"chapternav\"]/div/ul/li[8]/a/figure");
    private static final By AirTagBuyButton = By.xpath("//*[@data-analytics-title='buy apple airtag']");
    private static final By BuyAirTagPage = By.xpath("//*[@id=\"root\"]/div[2]");

    private static final Logger LOGGER = LogManager.getLogger(BuyAirTag.class);
    public BuyAirTag(WebDriver driver) {super(driver);}


    public BuyAirTag ClickOnBuyiPhoneButton () {
        LOGGER.debug("user click on Buy iPhone Button");
        ActOn.element(driver, BuyiPhoneButton).click();
        return this;
    }
    public BuyAirTag ClickOnAirTagButton () {
        LOGGER.debug("user click on AirTag Button");
        ActOn.element(driver, AirTagButton).click();
        return this;
    }
    public BuyAirTag ClickOnAirTagBuyButton () {
        LOGGER.debug("user click on AirTag Buy Button");
        ActOn.element(driver, AirTagBuyButton).click();
        return this;
    }
    public  BuyAirTag ValidationBuyAirTagBagPage() {
        LOGGER.debug("ValidateBuyAirTagBagPage");
        boolean CheckBuyAirTagBagPageValidation = driver.findElement(BuyAirTagPage).isDisplayed();
        Assert.assertTrue("Review Air Tag Bag page name is Displayed on the page", CheckBuyAirTagBagPageValidation);
        return this;
    }
}


