package com.browserstack;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.URL;


public class AppiumTest_step1_android {

//    public AppiumDriver driver;
    public AndroidDriver driver;

    @BeforeMethod(alwaysRun=true)
    @Before
    public void setUp() throws Exception {
//        MutableCapabilities capabilities = new UiAutomator2Options();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","PG Honor");
        capabilities.setCapability("udid",System.getenv("pg_android_device_id"));
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","9");
        capabilities.setCapability("appPackage","org.wikipedia");
        capabilities.setCapability("appActivity","org.wikipedia.main.MainActivity");
        capabilities.setCapability("automationName","uiautomator2");
        capabilities.setCapability("app","/Users/aravindhpg/Downloads/org-wikipedia-50280-58002509-9c08a8181e7545c5d3903ed217bda783.apk");


//
//        URL url = new URL("http://0.0.0.0:4723");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723"),capabilities);
    }

    @AfterMethod(alwaysRun=true)
    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
