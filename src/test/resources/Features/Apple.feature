Feature: Test Apple Functionalities

  Background:
    Given a user is on the home page

  @MacBook
  Scenario: Check MacBook Air page is successful with valid credentials
    When user click on Mac Button
    And click on MacBook Air button
    Then user landed on MacBook Air page

  @iPad
  Scenario:Check iPad page is successful with valid credentials

    When user click on iPad Button
    And click on iPad Air button
    Then user landed on iPad Air page

  @iPhone
  Scenario:Check iPhone page is successful with valid credentials

    When user click on iPhone Button
    And click on iPhone 13 button
    Then user landed on iPhone 13 page
  @Watch
  Scenario: Check Watch page is successful with valid credentials

    When user click on Watch Button
    And click on Apple Watch7 button
    Then user landed on Apple Watch7 page

  @AirPods
  Scenario: Check AirPods page is successful with valid credentials

    When user click on AirPods Button
    And click on AirPods Pro Button
    Then user landed on AirPods Pro page

  @OnlyOnApple
  Scenario:  Check Only on Apple page is successful with valid credentials

    When user click on Only on Apple Button
    And click on Apple Music Button
    Then user landed on Apple Music page

  @ShoppingBag
  Scenario: Check Shopping Bag is successful with valid credentials
    When user click on Shopping Bag Button
    And click on Sign In Button
    Then user landed on Sign In page

  @ShoppingCart
  Scenario: Check Shopping Cart is successful with valid credentials
    When user click on Shopping Cart Button
    And click on Orders Button
    Then user landed on Find Your Orders page

  @TV
  Scenario: Check Tv is successful with valid credentials
    When user click on TV Button
    And click on Apple TV 4K Button
    Then user landed on Apple TV 4K page

  @TV&Home
  Scenario: Check Tv&Home is successful with valid credentials
    When user click on TVAndHome Button
    And click on Apple TV App Button
    Then user landed on Apple TV App page

  @FindStore
  Scenario: Check Find Store is successful with valid credentials
    When user click on Find A Store Button
    Then user landed on Find A Store Page

  @BuyAirPods
  Scenario: Check Buy AirPods is successful with valid credentials
    When user click on Buy AirPods Button
    And user click on Airpods 3rd Generation
    And user landed on Airpods 3rd generation page and user click on Buy
    And user is able to see add to bag and click on add to bag button
    Then user land on Review Your Bag page

  @BuyAirTag
  Scenario: Check Buy AirTag is successful with valid credentials
    When user click on Buy iPhone Button
    And user click on AirTag Button
    And user landed on AirTag page and user click on Buy
    Then User land on Buy AirTag Page

  @BuyAccessories
  Scenario: Check BrowseAll is successful with valid credentials
    When user click on Accessories Button
    And user is able to click on BrowseAll
    And user is able to click on Cases
    And user is able to click on Silicone Case
    And user is able to choose Red Color
    And user is able to click Add to Bag
    And user is able to click on CheckOut Button
    Then User land on Checkout Page
    








