package com.browserstack;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.URL;


public class AppiumTest_step1_iPhone {

    public IOSDriver driver;

    @BeforeMethod(alwaysRun=true)
    public void setUp() throws Exception {
//        MutableCapabilities options = new XCUITestOptions();
//        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),options);

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","iPhone 14");

        cap.setCapability("platformName","iOS");
        cap.setCapability("platformVersion","16.4");
//        cap.setCapability("appPackage","org.wikipedia");
//        cap.setCapability("appActivity","org.wikipedia.main.MainActivity");
        cap.setCapability("automationName","XCUITest");
//        cap.setCapability("app","/Users/aravindhpg/Library/Developer/Xcode/DerivedData/Wikipedia-blmottggraibtygvjzfkjjbhjxod/Build/Products/Debug-iphonesimulator/Wikipedia.app");
        cap.setCapability("app","/Users/aravindhpg/Downloads/testng-appium-app-browserstack-sdk/ios/testng-examples/Payload/Wikipedia.app");
        cap.setCapability("WebDriverAgentURL","http://192.168.29.230:8100");
        cap.setCapability("derivedDataPath","/Users/aravindhpg/Library/Developer/Xcode/DerivedData/WebDriverAgent-eezfsawkcteaudgeatpzwrkbihrw");
        cap.setCapability("wdaLocalPort",8101);

        URL url = new URL("http://0.0.0.0:4723");
        driver = new IOSDriver (url, cap);



    }

    @AfterMethod(alwaysRun=true)
    public void tearDown() throws Exception {
        driver.quit();
    }
}
