Feature: Login

Scenario: Successful Login with Valid Credentials
Given open Google Chrome and navigate to Gmail page
When User logs in using username as "abhinabaghosh.1994@gmail.com" and password as "Abhi@2002"
Then login should be successful
Then User presses Sign Out button