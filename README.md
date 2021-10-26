# Android Testing Lab

This is a tutorial for testing in android with Kotlin

## Why do we test our code?

* Test cases verify our code is working correctly
* without test we need to test the same functionality of the app over and over again to verify is working
* With JUnit we can test out code with a single click whenever we want

## Types of test in Android apps

``Unit test``

* Test of a single unit of our app (e.g. testing the function of a class)

``Integration test``

* Test two components of our app work together (e.g. fragment and viewmodel)
* Integrated test are diferent because to do this an emulator is needed

``UI test``

* Test if many or all components of your app work together well and if the UI looks like it should
* Runs in emulator

## Test Driven Development (TDD)

* Is basicly a development style
* Main principle: write the test case before the implementation of the function(only for unit test)
* Steps
    1) Write the function signature
    2) Write the test cases for the function
    3) Write the function logic so the test pass
* You should only have a single assertion per case test
