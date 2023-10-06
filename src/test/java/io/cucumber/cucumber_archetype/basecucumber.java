package io.cucumber.cucumber_archetype;


import static io.github.mdk.drivers.AndroidDriverManager.createAndroidDriver;
import static io.github.mdk.drivers.AndroidDriverManager.quitSession;
import static io.github.mdk.server.AppiumServerManager.startServer;
import static io.github.mdk.server.AppiumServerManager.stopServer;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import io.github.mdk.drivers.AndroidDriverManager;

/**
 * @author MD Kashif
 * @since 10/06/2023
 **/

public class basecucumber {
	
    private static final String                     APP_PATH = String.valueOf (
            Path.of (System.getProperty ("user.dir"), "/src/test/resources/app", "webdriverio-app.apk"));
    private static final ThreadLocal<AndroidDriver> DRIVER   = new ThreadLocal<> ();
    private static final Logger                     LOG      = LogManager.getLogger ("DriverManager.class");

     
    @org.junit.BeforeClass()
    public void testSetup() {
        startServer ("android");
        //        setDriver (new AndroidDriver (getService ().getUrl (), geckoOptionsFirefox ()));
        try {
            setDriver (new AndroidDriver (new URL ("http://127.0.0.1:4723/wd/hub"), uiAutomator2OptionsChrome ()));
        } catch (final MalformedURLException e) {
            throw new RuntimeException (e);
        }
        setupDriverTimeouts ();
 
    }
    
    public static AndroidDriver getDriver () {
        return basecucumber.DRIVER.get ();
    }
    
    private static void setDriver (final AndroidDriver driver) {
    	basecucumber.DRIVER.set (driver);
    }

    private static void setupDriverTimeouts () {
        getDriver ().manage ()
            .timeouts ()
            .implicitlyWait (Duration.ofSeconds (5));
    }


    private static UiAutomator2Options uiAutomator2OptionsChrome () {

        final UiAutomator2Options uiAutomator2Options;
        uiAutomator2Options = new UiAutomator2Options ().setAvd ("PixelXLAPI31")
            .setAvdLaunchTimeout (Duration.ofSeconds (300))
            .setAvdReadyTimeout (Duration.ofSeconds (100))
            .setDeviceName ("emulator-5554")
            .setAutomationName (AutomationName.ANDROID_UIAUTOMATOR2)
            .withBrowserName ("chrome")
            .setAutoGrantPermissions (true)
            .setNoReset (false);

        return uiAutomator2Options;
    }

    
    @org.junit.AfterClass()
    public void tearDown() {
    	 if (null != DRIVER.get ()) {
             LOG.info ("Closing the driver...");
             getDriver ().quit ();
             DRIVER.remove ();
             stopServer ();
         }    }
    
  
}