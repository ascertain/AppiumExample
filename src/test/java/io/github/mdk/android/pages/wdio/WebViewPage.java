package io.github.mdk.android.pages.wdio;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.mdk.drivers.AndroidDriverManager;

import static io.github.mdk.drivers.AndroidDriverManager.getDriver;

import java.time.Duration;
import java.util.Set;

/**
 * @author MD Kashif
 * @since 10/06/2023
 **/
public class WebViewPage {


    public void switchToWebView() {//
        Set<String> contextNames = getDriver().getContextHandles();
        WebDriverWait wait = new WebDriverWait(AndroidDriverManager.getDriver(), Duration.ofSeconds(20));
        
        wait.until(d -> contextNames.size() > 1);
        //getDriver().context("WEBVIEW");
        getDriver().context(contextNames.toArray()[1].toString());
    }

    public void switchToNativeApp() {
        getDriver().context("NATIVE_APP");
    }

    public String getMainPageText() {
        HomePage homePage = new HomePage();
        homePage.openMenu("Webview");
        switchToWebView();
        return getDriver().findElement(By.cssSelector("header > div > p"))
                .getText();
    }
}
