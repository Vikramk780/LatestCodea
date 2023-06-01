Feature: Registartion page

Scenario: verify user registration 
Given user visits registration form
Then user do registration
And verifies succesmsg "A sign-up confirmation email has been sent to the email address provided. Click on the link in the email to complete the sign-up process and gain access to your account."