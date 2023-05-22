package com.browserstack;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class step1_iPhone extends AppiumTest_step1_iPhone {

  @Test
  public void test() throws Exception {
//    WebElement textButton = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
//        ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Text Button")));
//    textButton.click();
//    WebElement textInput = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
//        ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Text Input")));
//    textInput.sendKeys("hello@browserstack.com"+"\n");
//
//    Thread.sleep(5000);
//
//    WebElement textOutput = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
//        ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Text Output")));
//
//    Assert.assertEquals(textOutput.getText(),"hello@browserstack.com");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(4));
    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(AppiumBy.xpath("//XCUIElementTypeStaticText[@name='Skip']")));
    System.out.println("Waiting for Wikipedia to open");
    WebElement skipElement = driver.findElement(AppiumBy.xpath("//XCUIElementTypeStaticText[@name='Skip']"));
    skipElement.click();
    System.out.println("Skipped the initial Wiki Page");

    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(AppiumBy.xpath("//XCUIElementTypeSearchField[@name='Search Wikipedia']")));
    WebElement searchField = driver.findElement(AppiumBy.xpath("//XCUIElementTypeSearchField[@name='Search Wikipedia']"));
    searchField.click();
    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(AppiumBy.accessibilityId("Search Wikipedia")));
    searchField = driver.findElement(AppiumBy.accessibilityId("Search Wikipedia"));
    searchField.sendKeys("BrowserStack");
    //wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(AppiumBy.id("org.wikipedia:id/fragment_feed_header")));
    Thread.sleep(3000);
    WebElement searchResult = driver.findElement(AppiumBy.accessibilityId("BrowserStack"));
    searchResult.click();
    //driver.pressKey(new KeyEvent(AndroidKey.ENTER) );
    Thread.sleep(3000);
    System.out.println("Successfully entered Wikipedia Page");

  }
}
