package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Accessories extends NavigationBar{
    private static final By AccessoriesButton = By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[10]/a");
    private static final By BrowseAll = By.xpath("(//span[@class='disclosure-text'])[1]");
    private static final By Cases = By.xpath("//*[@id=\"as-localnav-tray-content\"]/div[2]/div/ul/li[4]/a");
    private static final By SiliconeCase = By.xpath("//body[1]/div[2]/div[7]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/div[1]/div[1]/h3[1]/a[1]");
    private static final By RedColor= By.xpath("(//img[@class='colornav-swatch'])[8]");
    private static final By AddToBag = By.id("add-to-cart");
    private static final By CheckOut = By.xpath("(//span[contains(text(),'Check Out')])[2]");
    private static final By  CheckoutPage= By.xpath("//*[@id=\"signin-container\"]/div[2]/div/div[2]");



    private static final Logger LOGGER = LogManager.getLogger(Accessories.class);

    public Accessories(WebDriver driver) {super(driver);}

    public Accessories ClickOnAccessoriesButton () {
        LOGGER.debug("user click on Accessories Button");
        ActOn.element(driver, AccessoriesButton).click();
        return this;
    }
    public Accessories ClickOnBrowseAll () {
        LOGGER.debug("user click on BrowseAll");
        ActOn.element(driver, BrowseAll).click();
        return this;
    }
    public Accessories ClickOnCases () {
        LOGGER.debug("user click on Cases");
        ActOn.element(driver, Cases).click();
        return this;
    }

    public Accessories ClickOnSiliconeCase () {
        LOGGER.debug("user click on Silicone Case");
        ActOn.element(driver, SiliconeCase).click();
        return this;

    }
    public Accessories ClickOnRedColor () {
        LOGGER.debug("user click on Red Color");
        ActOn.element(driver, RedColor).click();
        return this;
    }
    public Accessories ClickOnAddToBag () {
        LOGGER.debug("user click on Add To Bag");
        ActOn.element(driver, AddToBag).click();
        return this;
    }
    public Accessories ClickOnCheckOut () {
        LOGGER.debug("user click on Check Out");
        ActOn.element(driver, CheckOut).click();
        return this;
    }

    public Accessories ValidationCheckOutpage() {
        LOGGER.debug("ValidateCheckOutPage");
        boolean CheckOutPageValidation = driver.findElement(CheckoutPage).isDisplayed();
        Assert.assertTrue("CheckOut page name is Displayed on the page", CheckOutPageValidation);
        return this;
    }
}

