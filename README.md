# ReferenceAndroid
For the ReferenceAndroid App I have made some Kotlin test. These test can be run on emulators, local or cload devices.

## Getting started
These instructions will get you a copy of the project up and running on your local machine.

## Prerequisites
- [Android Studio](https://developer.android.com/studio/)
- Application Under Test (AUT): app-debug-androidTest.apk.
- Connect a test device to you machine or start an emulator before running the tests.
- Make sure that the language for test device or emulator is Dutch.

## Before executing a Test Case
5 test cases have been made in Espresso.
  -FabText: test if the text for the Fab is consistantant and correct.
  -MenuButton: test for text behind menu button is clickable and correct.
  -StartViewAppCorrectText: test for all visible text when starting the app is correct.
  -TabOnMenuAndCheckText: test for menu button (using Espresso test recorder).
  -TabMultipleTimesOnFab: multiple taps on Fab (without loop) to make sure app is not crashing.
  
## Executing a Test Case
Expand the Test Cases structure, where all the test cases are stored (androidTest/java/com.abnamro.apps.referenceandroid).
Select the test case you want to execute.
Choose run for executing the test case.
Select the test device (local, cloud or emulator).

## Execute all test on all connected devices
Open terminal in Android Studio.
Navigate to the project path.
Use the following command "gradlew connectedDebugAndroidTest" to run all tests on all connected devices.


