package io.github.mdk.android.pages.browser;

import static io.github.mdk.drivers.AndroidDriverManager.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author MD Kashif
 * @since 10/06/2023
 **/

public class TheInternetPage {

	public void navigateToInternetWebsite() {
		// getDriver().navigate().to("https://the-internet.herokuapp.com/");
		getDriver().navigate().to("https://www.unibet.co.uk/blog");
	}

	public String getPageHeader() {
		return getDriver().findElement(By.tagName("h1")).getText();
	}

	public String testSuccessfulSearch() {

		WebElement searchInput = getDriver().findElement(By.xpath("//form[@role='search']/input[@type='text']"));
		searchInput.sendKeys("football");
		searchInput.submit();

		// Use CSS selector to locate and validate the search result
		WebElement validresultElement = getDriver().findElement(By.cssSelector("span.result-num"));

		// Get the text content of the element
		String testSuccessfulSearchresultText = validresultElement.getText();

		return testSuccessfulSearchresultText;
	}

	public String testNoResultsForInvalidSearch() {

		 // Perform a search with an invalid keyword
        WebElement searchInput = getDriver().findElement(By.xpath("//form[@role='search']/input[@type='text']"));
        searchInput.sendKeys("&%()=");
        searchInput.submit();

        // // Get the text content of the element by Use CSS selector to locate and validate the message for no results
        WebElement noResultMessage = getDriver().findElement(By.id("search-results"));
        String testNoResultsForInvalidSearchresultText = noResultMessage.getText();

		return testNoResultsForInvalidSearchresultText;
	}
	
	public WebElement testSearchResultDisplayFeature() {

		 // Perform a search with an invalid keyword
		WebElement searchInput = getDriver().findElement(By.xpath("//form[@role='search']/input[@type='text']"));
        searchInput.sendKeys("football");
        searchInput.submit();

        // Validate that the search results container is present
        WebElement searchResultsContainer = getDriver().findElement(By.id("search-results"));

		return searchResultsContainer;
	}


}
