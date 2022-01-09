package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TV extends NavigationBar{
    private static final By TVButton = By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[8]/a");
    private static final By AppleTV4KButton = By.xpath("//*[@id=\"chapternav\"]/div/ul/li[1]/a/figure");
    private static final By AppleTV4KPage = By.xpath("//*[@id=\"ac-localnav\"]/div/div[2]");

    private static final Logger LOGGER = LogManager.getLogger(TV.class);

    public TV(WebDriver driver) {super(driver);}

    public TV ClickOnTVButton () {
        LOGGER.debug("user click on TV Button");
        ActOn.element(driver, TVButton).click();
        return this;
    }
    public TV ClickOnAppleTV4KButton () {
        LOGGER.debug("user click on Apple TV 4K Button");
        ActOn.element(driver, AppleTV4KButton).click();
        return this;
    }
    public TV ValidationAppleTV4KPage() {
        LOGGER.debug("ValidateAppleTV4KPage");
        boolean CheckAppleTV4KPageValidation = driver.findElement(AppleTV4KPage).isDisplayed();
        Assert.assertTrue("Apple TV 4K page name is Displayed on the page", CheckAppleTV4KPageValidation);
        return this;
    }


}

