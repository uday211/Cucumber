Feature: Multiplication

Scenario: Multiplication of two number
	Given I have two variables "9" & "12"
	When I do multipliction
	Then Result should display in console
	
Scenario: Multiplication of two number with List
	Given I have two variables as below
	|8	|
	|10	|
	When I do multipliction
	Then Result should display in console
	
Scenario: Multiplication of two number with DataTable
	Given I have two variables as below for DataTable
	|7	|90	|
	When I do multipliction
	Then Result should display in console
	
Scenario: Multiplication of two number with MapHandling1
	Given I have two variables as below for Maps
	|num1	 |num2|
	|100	 |200	|
	When I do multipliction
	Then Result should display in console
	
Scenario: Multiplication of two number with MapHandling2
	Given I have two variables as below for Map
	|num1	 |99	|
	|num2	 |100	|
	When I do multipliction
	Then Result should display in console
	
	
	