package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindStore extends NavigationBar{
    private static final By FindStoreButton = By.xpath("//*[@id=\"ac-globalfooter\"]/div/nav/div[3]/div/ul/li[1]/a");
    private static final By FindStorePage = By.xpath("(//a[normalize-space()='Find a store'])[1]");

    private static final Logger LOGGER = LogManager.getLogger(FindStore.class);

    public FindStore(WebDriver driver) {super(driver);}

    public FindStore ClickOnFindStoreButton () {
        LOGGER.debug("user click on Find Store Button");
        ActOn.element(driver, FindStoreButton).click();
        return this;
    }


    public  FindStore ValidationFindStorePage() {
        LOGGER.debug("ValidateFindStorePage");
        boolean checkFindStorePageValidation = driver.findElement(FindStorePage).isDisplayed();
        Assert.assertTrue("Find Store Page name is Displayed on the page", checkFindStorePageValidation);
        return this;
    }
}

