package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class iPhone extends NavigationBar{
    private static final By iPhoneButton = By.xpath("//*[@data-analytics-title='iphone']");
    private static final By iPhone13 = By.xpath("//*[@id=\"chapternav\"]/div/ul/li[2]/a/figure");
    private static final By iPhone13Page = By.xpath("//*[@id=\"ac-localnav\"]/div/div[2]/div[1]/a");

    private static final Logger LOGGER = LogManager.getLogger(iPhone.class);

    public iPhone(WebDriver driver) {
        super(driver);
    }
    public iPhone ClickOniPhoneButton () {
        LOGGER.debug("user click on iPhone Button");
        ActOn.element(driver, iPhoneButton).click();
        return this;
    }
    public iPhone ClickOniPhone13button () {
        LOGGER.debug("user click on iPhone 13 Button");
        ActOn.element(driver, iPhone13).click();
        return this;
    }
    public  iPhone ValidationiPhone13Page() {
        LOGGER.debug("ValidateiPhone13Page");
        boolean CheckiPhone13Validation = driver.findElement(iPhone13Page).isDisplayed();
        Assert.assertTrue("iPhone13 page name is Displayed on the page", CheckiPhone13Validation);
        return this;
    }


}


