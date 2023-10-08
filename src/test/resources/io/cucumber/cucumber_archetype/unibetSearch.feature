Feature: Unibet Search functionality

	Scenario 1: Verify Successful Search
		Given the Unibet website is open on a mobile browser
		When I locate the search bar on the mobile web page
		And I enter a valid search query (e.g., "football")
		And I click the search button
		Then I should see the search results text
		And the search results should contain relevant information related to the search query

	Scenario 2: Verify No Results for Invalid Search
		Given the Unibet website is open on a mobile browser
		When I locate the search bar on the mobile web page
		And I enter an invalid search query (e.g., "xyz123")
		And I click the search button
		Then I should see the search results page
		And the search results should indicate that there are no results for the given query

	Scenario 3: Verify Successful Search Displayed
		Given the Unibet website is open on a mobile browser
		When I locate the search bar on the mobile web page
		And I enter a valid search query (e.g., "football")
		And I click the search button
		Then I should see the search results page
		And the search results should contain relevant information related to the search query
