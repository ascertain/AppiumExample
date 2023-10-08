
## What is this Repository about?

- This repository contains the example code for running Android Mobile Automation tests with TDD framwork
  using [Appium 2.0](https://appium.io/docs/en/2.0/intro/)
- [WebdriverIO demo app](https://github.com/webdriverio/native-demo-app/releases) is used as a demo mobile application
  run tests
- This repo uses `Maven` as build tool and `TestNG` testing framework to run the tests.
- This repo is also contains the example code for running Android Mobile Automation tests in BDD framwork

---------------------------------------------------------------

## What are the Automated TestCases

### Test Case 1: Verify Successful Search

**Steps:**
1. **Precondition:** Launch the Unibet website on a mobile browser.
2. Locate the search bar on the mobile web page.
3. Enter a valid search query (e.g., "football").
4. Click the search button.
5. **Expected Result:** Validate that the search results text is visible.
6. **Verification:** Verify that the search results contain relevant information related to the search query.

### Test Case 2: Verify No Results for Invalid Search

**Steps:**
1. **Precondition:** Launch the Unibet website on a mobile browser.
2. Locate the search bar on the mobile web page.
3. Enter an invalid search query (e.g., "xyz123").
4. Click the search button.
5. **Expected Result:** Validate that the search results page is displayed.
6. **Verification:** Verify that the search results indicate that there are no results for the given query.

### Test Case 3: Verify Successful Search Displayed

**Steps:**
1. **Precondition:** Launch the Unibet website on a mobile browser.
2. Locate the search bar on the mobile web page.
3. Enter a valid search query (e.g., "football").
4. Click the search button.
5. **Expected Result:** Validate that the search results page is displayed.
6. **Verification:** Verify that the search results contain relevant information related to the search query.

---------------------------------------------------------------

## How to run the Tests?
TDD with POM appoach 
- Clean the project by running the command mvn clean
- Install the necessary packages by running mvn install
- Locate the testng.xml from test-suite rightclick and run as testNg Suite
BDD
- Locate RunCucumberTest from io.cucumber.cucumber_archetype package right click and run as JUnit Test
  
---------------------------------------------------------------

### Pre-Requisite:

    - JAVA JDK 11 should be installed
    - Android Emulator should be created in local machine and should be in running state
    - For running iOS tests, iOS Simulator needs to be started and should be in running state 

### :movie_camera: Tutorial for Installing Android Studio on Windows 10
[![Watch the video](https://img.youtube.com/vi/CMrfuCR6W94/hqdefault.jpg)](https://youtu.be/CMrfuCR6W94)

---------------------------------------------------------------

## :writing_hand: Blog Links

- [Beginner’s Guide to Appium 2.0](https://medium.com/@iamfaisalkhatri/beginners-guide-to-appium-2-0-d8118b31837c)
- [Appium 2 Migration Guide: Migrating From Appium 1.x To Appium 2.x](https://medium.com/@iamfaisalkhatri/appium-2-migration-guide-migrating-from-appium-1-x-to-appium-2-x-f1721b31197)
- [Basic Appium and Cucumber - BDD Framework](https://medium.com/ralali-engineering/basic-appium-and-cucumber-bdd-framework-3eabef9ec033)
- [How To Automate ServiceNow With Appium](https://medium.com/@iamfaisalkhatri/how-to-automate-servicenow-with-appium-8cc4aee3ed44)
- [Complete Tutorial On Appium Parallel Testing- [With Examples]](https://www.lambdatest.com/blog/appium-parallel-testing/)
- [React Native Testing For Apps On iOS And Android Using Appium](https://www.lambdatest.com/blog/test-react-native-apps-on-ios-and-android/)
- [How to Choose Mobile Devices for Testing](https://medium.com/@iamfaisalkhatri/how-to-choose-mobile-devices-for-testing-pcloudy-blog-96179529d0f3)
- [What is an Android Emulator? How to Start and use it?](https://medium.com/@iamfaisalkhatri/what-is-an-android-emulator-how-to-start-and-use-it-66fdcf52be7e)
- [How to start Appium Server Programmatically?](https://medium.com/@iamfaisalkhatri/how-to-start-appium-server-programmatically-ec07292ab59)
- [Guide to Mobile Testing](https://medium.com/@iamfaisalkhatri/guide-to-mobile-testing-d0dd2d9b59f1)
- [Inspecting elements of an app using Appium Inspector and BrowserStack!](https://medium.com/@iamfaisalkhatri/inspecting-elements-of-an-app-using-appium-inspector-and-browserstack-32c095a5333c)

---------------------------------------------------------------

## : Folder Structure for POM based approach 
## Page Objectt Model
src/
├── main/
│   ├── io.github.mdk.drivers
│	│   ├──	AndroidDriverManager.java (getDriver() and SetDriver())
│   ├── io.github.mdk.Servers
│	│   ├──	AppiumServerManager.java (startServer and stopServer Appium Server)
└── test/
    ├── io.github.mdk.android
		│   ├──	pages
		│	│   ├──browser
		│		│   ├──	TheInternetPage.java (POM based mplementaition of TCs)
		│   ├──	tests
			│   ├──	AndroidTests.java (## Test Case Calling )
			│   ├──	BaseTest.java (createAndroidDriver() and quitSession())

## Cucumber 
src/
├── main/
└── test/
    ├── java
		├──io.cucumber.cucumber_archetype
		│   ├──	basecucumber.java
		│   ├──	RunCucumberTest.java
		│   ├──	StepDefinitions.java
		resources
		├──io.cucumber.cucumber_archetype
		│   ├──	example.feature
		│   ├── unibetSearch.feature

			

---------------------------------------------------------------

## :question: Need Assistance?

mail me @ `subrati@d1lab.com` and Chekout details at https://subrati.d1lab.in/

---------------------------------------------------------------