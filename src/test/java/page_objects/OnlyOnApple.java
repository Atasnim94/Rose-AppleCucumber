package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnlyOnApple extends NavigationBar{
    private static final By OnlyOnAppleButton = By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[9]/a");
    private static final By AppleMusicButton= By.xpath("//*[@id=\"chapternav\"]/div/ul/li[2]/a/figure");
    private static final By AppleMusicPage= By.xpath("//*[@id=\"ac-localnav\"]/div/div[2]/div[1]/a");

    private static final Logger LOGGER = LogManager.getLogger(OnlyOnApple.class);

    public OnlyOnApple(WebDriver driver) {super(driver);}


        public OnlyOnApple ClickOnOnlyOnAppleButton(){
            LOGGER.debug("user click on OnlyOnApple Button");
            ActOn.element(driver, OnlyOnAppleButton).click();
            return this;
        }
        public OnlyOnApple ClickOnAppleMusicButton () {
            LOGGER.debug("user click on Apple Music Button");
            ActOn.element(driver, AppleMusicButton).click();
            return this;
        }
        public OnlyOnApple ValidationAppleMusicPage () {
            LOGGER.debug("ValidateAppleMusicPage");
            boolean CheckAppleMusicValidation = driver.findElement(AppleMusicPage).isDisplayed();
            Assert.assertTrue("Apple Music page name is Displayed on the page", CheckAppleMusicValidation);
            return this;
        }


    }


