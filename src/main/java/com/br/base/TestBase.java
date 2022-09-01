package com.br.base;



import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class TestBase {


    public static Properties prop;

    public static AppiumDriver driver = null;

    public TestBase(){
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/crm"
                    + "/qa/config/config.properties");
            prop.load(ip);
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initialization() throws MalformedURLException {

        AndroidTouchAction actions = null;
        String driverPath = prop.getProperty("deviceName");
        final String port = prop.getProperty("port");
        final String appActivity = prop.getProperty("appActivity");
        final String noReset = prop.getProperty("noReset");
        final String appPackage = prop.getProperty("appPackage");
        final String platformName = prop.getProperty("platformName");


        if (driver ==  null) {
            UiAutomator2Options caps = new UiAutomator2Options();

            caps.setCapability(MobileCapabilityType.DEVICE_NAME, driverPath); //device name which  you have connected
            caps.setCapability("platformName", platformName); //platform name which type of platform you are using
            caps.setCapability("app", System.getProperty("user.dir") + "/App/ridmik.apk"); //file directory
            caps.setCapability("appPackage", appPackage);
            caps.setCapability("noReset", noReset);
            caps.setCapability("appActivity", appActivity);
            driver = new AppiumDriver(new URL("http://localhost:" + port + "/wd/hub"), caps);//server URl


        }

    }





}
