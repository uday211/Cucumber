Feature: Login Function
 
  Scenario Outline: To do Data Driven Testing on Login Functionality
    Given Chrome Browser with Login Page is Opened
    When User Enters "<UserName>", "<Password>" & Click on Login
    Then Login "<LoginType>" be happen.

    Examples: 
      | UserName  | Password | LoginType  |
      | admin 		| admin123 | should			|
      | hr 				| hr 			 | shouldNot  |
      | sys				| system@1 | should		  |
