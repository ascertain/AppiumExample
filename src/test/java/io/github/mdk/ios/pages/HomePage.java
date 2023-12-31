package io.github.mdk.ios.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static io.github.mdk.drivers.IOSDriverManager.getDriver;

import java.time.Duration;
/**
 * @author MD Kashif
 * @since 10/06/2023
 **/
public class HomePage {

    private final WebDriverWait wait;

    public HomePage() {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    }

    public String getTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated
                (AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"WEBDRIVER\"`]"))).getText();
    }

    void openMenu(String menuName) {
        getDriver().findElement(AppiumBy.accessibilityId(menuName)).click();

    }

    public String tagLine() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                AppiumBy.accessibilityId("Demo app for the appium-boilerplate"))).getText();
    }

}
