Feature: SIGN-UP

Scenario: Verifying Sign-Up button
	Given User is on HomePage of Udemy
	When User clicks on SignUp link
	Then Sign-Up page should display

Scenario: Verifying Sign-Up with blank details 
	Given User is on SignUp page of Udemy
	When User clicks on SignUp button
	Then User should be on SignUp Page & registration should "not" happen
	
Scenario: Verifying Sign-Up with invalid Email & Valid Other 
	Given User is on SignUp page of Udemy
	When User Enters following Details & Clicks on sign up
			|name		|	Mohit 			|
			|email  |	 abc				|
			|password| lti@123456	|
	Then User should be on SignUp Page & registration should "not" happen
	
	
Scenario: Verifying Sign-Up with invalid PassWord & Valid Other 
	Given User is on SignUp page of Udemy
	When User Enters following Details & Clicks on sign up
			|name		|	Mohit 									|
			|email  |	 abc123@gmail.com				|
			|password| lti@123456							|
	Then User should be on SignUp Page & registration should "not" happen
	
	
