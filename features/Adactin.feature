@AdactInTesting
Feature: AdactIn Hotel End to End to test case

Background: User able to launch the Browser
Given User able to launch the application
When User enter the username 'suresh2rck' in Login Page
And User enter the password 'QEK8DR' in Login Page
And User Click the signin Button in Login Page
Then User Verify the username 'Hello suresh2rck!' displayed in the header



Scenario Outline: User able to select the hotel booking
When User able to select the location
And User able to select the hotel
And User able to select the Room type
And User able to select the Number of rooms
And User able to select '<Checkindate>' in the Checkin date box
And User able to select '<Checkoutdate>' in the checkout date box
Then User able to click the search button
And User able to logout the application

Examples:
|Checkindate	|Checkoutdate	|
|04/08/2022		|02/08/2022		|



Scenario Outline: User able to select the hotel booking and verify the name
When User able to select the location
And User able to select the hotel
And User able to select the Room type
And User able to select the Number of rooms
And User able to select '<Checkindate>' in the Checkin date box
And User able to select '<Checkoutdate>' in the checkout date box
And User able to select the adult counts
And User able to click the search button
Then User able to verify the hotelname as given
And User able to logout the application
Examples:
|Checkindate	|Checkoutdate	|
|04/08/2019		|06/08/2019		|

