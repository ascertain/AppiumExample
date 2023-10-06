package io.cucumber.cucumber_archetype;

import io.cucumber.java.en.*;
import io.github.mdk.android.pages.browser.TheInternetPage;
import io.github.mdk.android.tests.AndroidTests;

import org.junit.jupiter.api.Assertions.*;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.AppiumBy;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import static io.github.mdk.drivers.AndroidDriverManager.getDriver;
import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author MD Kashif
 * @since 10/06/2023
 **/

public class StepDefinitions extends basecucumber {

    @Given("an example scenario")
    public void anExampleScenario() {
    	System.out.println("in given");
    	
    	testSetup();
    	
        getDriver().navigate().to("https://www.unibet.co.uk/blog");

        String getPageHeader = getDriver().findElement(By.tagName("h1")).getText();
        
        assertEquals (getPageHeader, "Sports News & Latest Football Updates | Unibet Blog");
       	
        WebElement searchInput = getDriver().findElement(By.xpath("//form[@role='search']/input[@type='text']"));
        searchInput.sendKeys("football");
        searchInput.submit();
        
        //Use CSS selector to locate and validate the search result
        WebElement resultElement = getDriver().findElement(By.cssSelector("span.result-num"));

        // Get the text content of the element
        String resultText = resultElement.getText();

        // Assert that the text contains the expected result
        Assert.assertTrue(resultText.contains("results found"), "Expected result not found");
        
        
        tearDown();
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    	System.out.println("in when");
    	
    	testSetup();
    	
        getDriver().navigate().to("https://www.unibet.co.uk/blog");

    	
        // Perform a search with an invalid keyword
        WebElement searchInput = getDriver().findElement(By.xpath("//form[@role='search']/input[@type='text']"));
        searchInput.sendKeys("&%()=");
        searchInput.submit();

        // Use CSS selector to locate and validate the message for no results
        WebElement noResultMessage = getDriver().findElement(By.id("search-results"));
        String messageText = noResultMessage.getText();

        // Assert that the message contains the expected text
        Assert.assertTrue(messageText.contains("Sorry, no results were found"), "Expected message not found for invalid search");
    
        tearDown();
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    	System.out.println("in then");
    	
    	testSetup();
    	
        getDriver().navigate().to("https://www.unibet.co.uk/blog");

    	
        // Your implementation for the test case verifying the auto-suggestion feature
        WebElement searchInput = getDriver().findElement(By.xpath("//form[@role='search']/input[@type='text']"));
        searchInput.sendKeys("football");
        searchInput.submit();

     // Validate that the search results container is present
        WebElement searchResultsContainer = getDriver().findElement(By.id("search-results"));
        Assert.assertTrue(searchResultsContainer.isDisplayed(), "Search results container is not displayed");
    
        tearDown();

    }

}
