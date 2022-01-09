package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar {
    private static final By AppleLogo = By.id("ac-gn-firstfocus");
    private static final By MacButton = By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[3]/a");
    private static final By iPadButton = By.xpath("//*[@href='/ipad/']");
    private static final By iPhoneButton = By.xpath("//*[@data-analytics-title='iphone']");
    private static final By WatchButton = By.xpath("//*[@data-analytics-title='watch']");
    private static final By AirPodsButton = By.xpath("//*[@data-analytics-title='airpods']");
    private static final By OnlyOnAppleButton = By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[9]/a");
    private static final By ShoppingBagButton = By.xpath("//*[@id=\"ac-gn-bag\"]/div/a");
    private static final By ShoppingCartButton = By.xpath("//*[@data-string-badge='Shopping Bag with item count : {%BAGITEMCOUNT%}']");
    private static final By TVButton = By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[8]/a");
    private static final By TVAndHomeButton = By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[8]/a");
    private static final By BuyAirPodsButton = By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[7]/a");
    private static final By FindStoreButton = By.xpath("//*[@id=\"ac-globalfooter\"]/div/nav/div[3]/div/ul/li[1]/a");
    private static final By BuyiPhoneButton = By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[5]/a");
    private static final By AccessoriesButton = By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[10]/a");



    private static final Logger LOGGER = LogManager.getLogger(NavigationBar.class);

    public WebDriver driver;

    public NavigationBar(WebDriver driver) {
        this.driver = driver;
    }

    public NavigationBar mouseHoverToAppleLogo() {
        LOGGER.debug("Mouse hover to Apple Logo");
        ActOn.element(driver, AppleLogo).click();
        return this;
    }

    public MacBook navigateToMacButton() {
        LOGGER.debug("Navigating to MacButton");
        ActOn.element(driver, MacButton).click();
        return new MacBook( driver);
    }

    public iPad navigateToIpadButton() {
        LOGGER.debug("Navigation to iPadButton");
        ActOn.element(driver, iPadButton).click();
        return new iPad(driver);
    }

    public iPhone navigateToIphoneButton() {
        LOGGER.debug("Navigation to iPhoneButton");
        ActOn.element(driver, iPhoneButton).click();
        return new iPhone (driver);
    }
    public Watch navigateToWatchButton() {
        LOGGER.debug("Navigation to WatchButton");
        ActOn.element(driver, WatchButton).click();
        return new Watch (driver);
    }
    public AirPods navigateToAirPodsButton() {
        LOGGER.debug("Navigation to AirPodsButton");
        ActOn.element(driver, AirPodsButton).click();
        return new AirPods (driver);
    }
    public OnlyOnApple navigateToOnlyOnAppleButton() {
        LOGGER.debug("Navigation to Only On Apple Button");
        ActOn.element(driver, OnlyOnAppleButton).click();
        return new OnlyOnApple (driver);
    }
    public ShoppingBag navigateToShoppingBagButton() {
        LOGGER.debug("Navigation to Shopping Bag Button");
        ActOn.element(driver, ShoppingBagButton).click();
        return new ShoppingBag(driver);
    }
    public ShoppingCart navigateToShoppingCartButton() {
        LOGGER.debug("Navigation to Shopping Cart Button");
        ActOn.element(driver, ShoppingCartButton).click();
        return new ShoppingCart(driver);
    }
    public TV navigateToTVButton() {
        LOGGER.debug("Navigation to TV Button");
        ActOn.element(driver, TVButton).click();
        return new TV(driver);
    }
    public TVAndHome navigateToTVAndHomeButton() {
        LOGGER.debug("Navigation to TVAndHome Button");
        ActOn.element(driver, TVAndHomeButton).click();
        return new TVAndHome(driver);
    }
    public BuyAirPods navigateToBuyAirPodsButton() {
        LOGGER.debug("Navigation to Buy AirPods Button");
        ActOn.element(driver, BuyAirPodsButton).click();
        return new BuyAirPods(driver);
    }
    public FindStore navigateToFindStoreButton() {
        LOGGER.debug("Navigation to Find Store Button");
        ActOn.element(driver, FindStoreButton).click();
        return new FindStore (driver);
    }
    public BuyAirTag navigateToBuyiPhoneButton() {
        LOGGER.debug("Navigation to Buy iPhone Button");
        ActOn.element(driver, BuyiPhoneButton).click();
        return new BuyAirTag (driver);

    }
    public Accessories navigateToBuyAccessoriesButton() {
            LOGGER.debug("Navigation to Buy Accessories Button");
            ActOn.element(driver, AccessoriesButton).click();
            return new Accessories (driver);
    }




}



