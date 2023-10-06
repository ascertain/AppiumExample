package io.github.mdk.ios.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import static io.github.mdk.drivers.IOSDriverManager.getDriver;

import java.time.Duration;
import java.util.Set;

/**
 * @author MD Kashif
 * @since 10/06/2023
 **/
public class WebViewPage {


    public void switchToWebView() {
        Set<String> contextNames = getDriver().getContextHandles();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(d -> contextNames.size() > 1);
        getDriver().context(contextNames.toArray()[1].toString());
        //getDriver().context("WEBVIEW_com.wdiodemoapp");
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
