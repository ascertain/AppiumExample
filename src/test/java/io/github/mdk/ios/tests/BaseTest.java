package io.github.mdk.ios.tests;

import static io.github.mdk.drivers.AndroidDriverManager.quitSession;
import static io.github.mdk.drivers.IOSDriverManager.createIOSDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * @author MD Kashif
 * @since 10/06/2023
 **/
public class BaseTest {

    @BeforeClass(alwaysRun = true)
    public void testSetup() {
        createIOSDriver();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        quitSession();
    }

}
