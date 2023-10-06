package io.github.mdk.android.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import io.github.mdk.android.pages.browser.TheInternetPage;
import io.github.mdk.android.pages.proverbial.Notifications;
import io.github.mdk.android.pages.wdio.DragPage;
import io.github.mdk.android.pages.wdio.FormPage;
import io.github.mdk.android.pages.wdio.HomePage;
import io.github.mdk.android.pages.wdio.SignUpPage;
import io.github.mdk.android.pages.wdio.SwipePage;
import io.github.mdk.android.pages.wdio.WebViewPage;

import org.testng.annotations.Test;

/**
 * @author MD Kashif
 * @since 10/06/2023
 **/
public class AndroidTests extends BaseTest {

    @Test
    public void testChrome () {
        final TheInternetPage theInternetPage = new TheInternetPage ();
        theInternetPage.navigateToInternetWebsite ();
        //assertEquals (theInternetPage.getPageHeader (), "Welcome to the-internet");
        assertEquals (theInternetPage.getPageHeader (), "Sports News & Latest Football Updates | Unibet Blog");
    }

    @Test
    public void testDragAndDrop () {
        final DragPage dragPage = new DragPage ();
        dragPage.dragAndDropPrices ();
        assertEquals (dragPage.congratulationsText (), "Congratulations");
    }

    @Test
    public void testFirefoxBrowser () {
        final TheInternetPage theInternetPage = new TheInternetPage ();
        theInternetPage.navigateToInternetWebsite ();
        assertEquals (theInternetPage.getPageHeader (), "Welcome to the-internet");
    }

    @Test
    public void testForm () {
        final String inputText = "This is Appium Test";
        final FormPage formPage = new FormPage ();
        formPage.fillForm (inputText, 2);
        assertEquals (formPage.getInputText (), inputText);
        assertEquals (formPage.getSwitchText (), "Click to turn the switch OFF");
        assertEquals (formPage.getSelectedDropdownValue (), "Appium is awesome");
        formPage.submitForm ();

        assertEquals (formPage.getActiveMessageTitle (), "This button is");
        assertEquals (formPage.getActiveMessage (), "This button is active");
        formPage.closeMessage ();

        assertEquals (formPage.checkInActiveBtn (), "false");

    }

    @Test
    public void testHomePageTitle () {
        final HomePage homePage = new HomePage ();
        assertEquals (homePage.getTitle (), "WEBDRIVER");
        assertEquals (homePage.tagLine (), "Demo app for the appium-boilerplate");
    }

    @Test
    public void testNotification () {
        final Notifications notifications = new Notifications ();
        assertTrue (notifications.checkNotificationIsDisplayed ());
        notifications.openNotificationPanel ();

        assertEquals (notifications.getAppNotificationTitle (), "Proverbial");
        assertEquals (notifications.getNotificationTitle (), "Test Notification");
        assertEquals (notifications.getNotificationText (), "Please enjoy this notification");
    }

    @Test
    public void testSignUp () {
        final SignUpPage signUpPage = new SignUpPage ();
        signUpPage.signUp ("test@email.com", "Pass@12345");
        assertEquals (signUpPage.getSuccessMessageTitle (), "Signed Up!");
        assertEquals (signUpPage.getSuccessMessage (), "You successfully signed up!");
        signUpPage.closeSuccessMessage ();
    }

    @Test
    public void testSwipeOnElement () {
        final SwipePage swipePage = new SwipePage ();
        swipePage.performHorizontalSwipe ();
        swipePage.performVerticalSwipe ();

    }

    @Test
    public void testSwipeTillElement () {

        final SwipePage swipePage = new SwipePage ();
        assertEquals (swipePage.swipeTillElement (), "You found me!!!");
    }

    @Test
    public void testSwipeUsingScrollIntoView () {
        final SwipePage swipePage = new SwipePage ();
        assertEquals (swipePage.swipeAndFindElement (), "You found me!!!");
    }

    @Test
    public void testWebView () {
        final WebViewPage webViewPage = new WebViewPage ();

        assertEquals (webViewPage.getMainPageText (),
            "Next-gen browser and mobile automation test framework for Node.js");
        webViewPage.switchToNativeApp ();
    }

}