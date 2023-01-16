Feature: Basic Contact Form
	Scenario Outline: To submit the basic contact form with valid data
	
		Given The website Home Page is already open
		When User enters the valid "<Name>" for the Your Name, valid "<Email>" for Email Address and valid message for Message field
		And User clicks on Submit button
		Then User is redirected to Thank You Page
		
		Examples:
			
			|Name   |Email        |
			|Kirtan1|Abc@gmail.com|
			|Kirtan2|Def@gmail.com|
			|Kirtan3|Xyz@gmail.com|