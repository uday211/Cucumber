Feature: Login Page

Scenario: Verifying Login Page Title
	Given Chrome Browser is Opened
	When user navigates to URL as "http://facebook.com"
	Then Title should be as "log in or sign upp"  

