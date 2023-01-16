Feature: SignUp
	Scenario: To SignUp using the given data
	
		Given The website Home Page is already open
		When User clicks on Account and selects Customer Signup
		And User enters the valid data for the fields on the Signup Page
			| Field      | Value          |
			| First Name | Kirtan         |
			| Last Name  | Gajjar         |
			| Phone      | 9876543210     |
			| Email      | abc@gmail.com  |
			| Password   | Abcde@12345    |
			
		And User clicks on Signup button
		Then User is redirected to Login Page