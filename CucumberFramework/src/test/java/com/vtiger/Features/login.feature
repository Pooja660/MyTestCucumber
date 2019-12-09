Feature: LoginPage functionality

@Smoke
Scenario: Valid login scenario
Given User should be on login page
When user enters valid credentials
Then user should be login successfully
And user should be landed on home page

@Sanity
Scenario Outline: InValid login scenario
Given User should be on login page
When user enters invalid credentials username "<Username>" and password "<Password>"
Then user should be on loginpage only
And user should get error msg "Invalid user id or password" 

Examples:
|Username | Password |
|admin1   | 1233     |
|admin2   | 1234     |
|admin5   | 1234     |

