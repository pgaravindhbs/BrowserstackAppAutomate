package com.browserstack;
//import os;

import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.MutableCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


public class AppiumTest_step2_android {

//    public AppiumDriver driver;
    public AndroidDriver driver;

    @BeforeMethod(alwaysRun=true)
    @Before
    public void setUp() throws Exception {
        MutableCapabilities capabilities = new UiAutomator2Options();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }

    @AfterMethod(alwaysRun=true)
    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
