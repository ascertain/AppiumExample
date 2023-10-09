
## What is this Repository about?

- This repository contains the example code for running Android Mobile Automation tests with TDD framwork
  using [Appium 2.0](https://appium.io/docs/en/2.0/intro/)
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
	- Install Cucumber Eclipse Plugin
	
	To install the Cucumber Eclipse plugin, you can follow these steps:

		1. **Open Eclipse:**
		   - Ensure that Eclipse IDE is installed on your machine.

		2. **Navigate to the Eclipse Marketplace:**
		   - Open Eclipse and go to the "Help" menu.
		   - Select "Eclipse Marketplace."

		3. **Search for Cucumber Plugin:**
		   - In the Eclipse Marketplace dialog, there is a search bar. Enter "Cucumber" in the search bar.

		4. **Find and Install Cucumber Eclipse Plugin:**
		   - You should see the "Cucumber Eclipse Plugin" in the search results.
		   - Click on the "Go to the full listing" link for more details.
		   - Click the "Go to the full listing" link to see the details of the plugin.
		   - Click the "Install" button to initiate the installation process.

		5. **Follow the Installation Wizard:**
		   - Follow the instructions in the installation wizard.
		   - You might need to review the list of features to be installed and accept the terms of the license agreement.
		   - Click "Finish" to complete the installation.

		6. **Restart Eclipse:**
		   - After the installation is complete, Eclipse will prompt you to restart.
		   - Restart Eclipse for the changes to take effect.

		7. **Verify Installation:**
		   - Once Eclipse has restarted, you can verify that the Cucumber plugin is installed by going to "Window" > "Preferences" > "Cucumber" in the Eclipse menu.

		Now, you should be able to use Cucumber features and scenarios in your Eclipse IDE. If you are working with Java, ensure that you have the necessary Cucumber libraries in your project.

		If you encounter any issues during the installation, make sure that your Eclipse IDE is up to date, and you may also want to check for compatibility between the Cucumber Eclipse plugin version and your Eclipse IDE version.
			
### Tutorial for Installing Android Studio on Windows 10
To install Android Studio on Windows 10, you can follow these steps:

1. **Download Android Studio:**
   - Visit the [official Android Studio download page](https://developer.android.com/studio).
   - Click on the "Download" button.

2. **Run the Installer:**
   - Once the download is complete, run the installer executable file (e.g., `android-studio-ide-xxx.xxx.xxx-windows.exe`).

3. **Follow the Installation Wizard:**
   - The Android Studio Setup Wizard will appear.
   - Click "Next" to begin the installation.

4. **Select Components:**
   - Choose the components you want to install. The default selections are usually sufficient.

5. **Choose Installation Location:**
   - Select the destination folder for the installation or use the default location.
   - Click "Next" to continue.

6. **Select Start Menu Folder:**
   - Choose a Start Menu folder or use the default.
   - Click "Install" to start the installation.

7. **Complete the Installation:**
   - Once the installation is complete, click "Next."

8. **Configure SDK Components:**
   - Android Studio will prompt you to install the Android SDK components. Click "Finish" to let Android Studio download and install the necessary components.

9. **Launch Android Studio:**
   - After the SDK components installation is complete, click "Finish" to exit the Setup Wizard.
   - Launch Android Studio. The first time you run Android Studio, it will download additional components, so be patient.

10. **Complete the Android Studio Setup:**
    - Follow the on-screen instructions to complete the Android Studio setup.
    - Set up the Android Virtual Device (AVD) if you want to run Android emulators.

11. **Update SDK and Plugins:**
    - After launching Android Studio, it's a good idea to check for updates. Go to "Help" > "Check for Updates" and update the IDE and plugins if needed.

That's it! You should now have Android Studio installed on your Windows 10 machine. You can start developing Android applications by creating new projects or opening existing ones.
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

![POMStructure](https://github.com/ascertain/AppiumExample/blob/main/src/test/resources/POMStructure.JPG)

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

![BDDStructure](https://github.com/ascertain/AppiumExample/blob/main/src/test/resources/Cucumber.JPG)

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