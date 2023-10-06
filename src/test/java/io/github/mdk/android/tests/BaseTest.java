package io.github.mdk.android.tests;

import static io.github.mdk.drivers.AndroidDriverManager.createAndroidDriver;
import static io.github.mdk.drivers.AndroidDriverManager.quitSession;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * @author MD Kashif
 * @since 10/06/2023
 **/
public class BaseTest {

    @BeforeClass(alwaysRun = true)
    public void testSetup() {
        createAndroidDriver();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        quitSession();
    }

}
