Feature: Login

Scenario: Successful Login with Valid Credentials to LinkedIn
Given open Google Chrome and navigate to LinkedIn page
When User logs in using username as "your_mail" and password as "your_password"
Then login should be successful
Then User presses Sign Out button
