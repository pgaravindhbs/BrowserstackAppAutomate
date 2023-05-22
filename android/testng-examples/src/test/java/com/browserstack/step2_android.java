package com.browserstack;

import java.time.Duration;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class step2_android extends AppiumTest_step2_android {

    @Test
    public void test() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(4));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(AppiumBy.id("org.wikipedia:id/fragment_onboarding_skip_button")));
        System.out.println("Waiting for wikipedia app to open");
        WebElement skipElement = driver.findElement(AppiumBy.id("org.wikipedia:id/fragment_onboarding_skip_button"));
        skipElement.click();
        System.out.println("Skipped the initial Wiki screen");
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(AppiumBy.id("org.wikipedia:id/fragment_feed_header")));
        WebElement searchField = driver.findElement(AppiumBy.id("org.wikipedia:id/fragment_feed_header"));
        searchField.click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(AppiumBy.id("org.wikipedia:id/search_src_text")));
        searchField = driver.findElement(AppiumBy.id("org.wikipedia:id/search_src_text"));
        searchField.sendKeys("Browserstack");
        System.out.println("Searching for Browserstack in Wikipedia");
        //wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(AppiumBy.id("org.wikipedia:id/fragment_feed_header")));
        Thread.sleep(3000);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER) );

//        WebElement searchElement = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
//                ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Search Wikipedia")));
//
//        searchElement.click();
//        WebElement insertTextElement = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
//                ExpectedConditions.elementToBeClickable(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")));
//        insertTextElement.sendKeys("BrowserStack");
        Thread.sleep(3000);

//        driver.pressKey(new KeyEvent(AndroidKey.ENTER) );

//        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));

//        Thread.sleep(3000);
        System.out.println("Entered Wiki page of Browserstack successfully");
    }
}
