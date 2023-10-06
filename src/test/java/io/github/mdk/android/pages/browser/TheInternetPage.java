package io.github.mdk.android.pages.browser;

import static io.github.mdk.drivers.AndroidDriverManager.getDriver;

import org.openqa.selenium.By;

/**
 * @author MD Kashif
 * @since 10/06/2023
 **/

public class TheInternetPage {

    public void navigateToInternetWebsite() {
        //getDriver().navigate().to("https://the-internet.herokuapp.com/");
        getDriver().navigate().to("https://www.unibet.co.uk/blog");
    }

    public String getPageHeader() {
        return getDriver().findElement(By.tagName("h1")).getText();
    }

}
