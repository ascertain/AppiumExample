package io.github.mdk.android.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

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

	final TheInternetPage theInternetPage = new TheInternetPage ();
    
    @Test(priority = 1)
    public void testChrome () {
        
        theInternetPage.navigateToInternetWebsite ();
        //assertEquals (theInternetPage.getPageHeader (), "Welcome to the-internet");
        assertEquals (theInternetPage.getPageHeader (), "Sports News & Latest Football Updates | Unibet Blog");
    }

    @Test(priority = 2)
    public void testSuccessfulSearch() {
           theInternetPage.navigateToInternetWebsite ();

        // Assert that the text contains the expected result
        Assert.assertTrue(theInternetPage.testSuccessfulSearch().contains("1586 results found"), "Expected result not found");

    }

    @Test(priority = 3)
    public void testNoResultsForInvalidSearch() {
      
    	theInternetPage.navigateToInternetWebsite ();
    	
        // Assert that the message contains the expected text
        Assert.assertTrue(theInternetPage.testNoResultsForInvalidSearch().contains("Sorry, no results were found"), "Expected message not found for invalid search");
    }

    @Test(priority = 4)
    public void testSearchResultDisplayFeature() {
        
    	theInternetPage.navigateToInternetWebsite ();
    	
    	// Validate that the search results container is present
        
        Assert.assertTrue(theInternetPage.testSearchResultDisplayFeature().isDisplayed(), "Search results container is not displayed");

    }
    
}