Feature: Basic Contact Form
	Scenario: To submit the basic contact form with valid data
	
		Given The website Home Page is already open
		When User enters the valid data for the Your Name, Email Address and Message fields
		
			| Name  | Kirtan        |
			| Email | abc@gmail.com |
			
		And User clicks on Submit button
		Then User is redirected to Thank You Page