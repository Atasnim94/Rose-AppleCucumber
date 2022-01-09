package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyAirPods extends NavigationBar{
    private static final By BuyAirPodsButton = By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[7]/a");
    private static final By AirPods3rdGeneration = By.xpath("//*[@id=\"chapternav\"]/div/ul/li[2]/a/span[1]");
    private static final By BuyButton = By.xpath("//*[@id=\"ac-localnav\"]/div/div[2]/div[2]/div[2]/div[2]/a");
    private static final By AddToBag = By.xpath("//*[@id=\"add-to-cart\"]");
    private static final By ReviewBagPage = By.xpath("//*[@id=\"bag-content\"]/div[1]/h1");

    private static final Logger LOGGER = LogManager.getLogger(BuyAirPods.class);

    public BuyAirPods(WebDriver driver) {super(driver);}

    public BuyAirPods ClickOnBuyAirPodsButton () {
        LOGGER.debug("user click on Buy AirPods Button");
        ActOn.element(driver, BuyAirPodsButton).click();
        return this;
    }
    public BuyAirPods ClickOnAirPods3rdGenerationbutton () {
        LOGGER.debug("user click on AirPods 3rd Generation Button");
        ActOn.element(driver, AirPods3rdGeneration).click();
        return this;
    }
    public BuyAirPods ClickOnBuyButton () {
        LOGGER.debug("user click on Buy Button");
        ActOn.element(driver, BuyButton).click();
        return this;
    }
    public BuyAirPods ClickOnAddToBagbutton () {
        LOGGER.debug("user click on Add To Bag Button");
        ActOn.element(driver, AddToBag).click();
        return this;
    }
    public  BuyAirPods ValidationReviewBagPage() {
        LOGGER.debug("ValidateReviewBagPage");
        boolean CheckReviewBagPageValidation = driver.findElement(ReviewBagPage).isDisplayed();
        Assert.assertTrue("Review Bag page name is Displayed on the page", CheckReviewBagPageValidation);
        return this;
    }
}


