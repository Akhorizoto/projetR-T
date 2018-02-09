@capec163
Feature: CAPEC-163: Spear Phishing
#2. Experiment
Scenario: Step2.3 Optional: Build variants of the website with very specific user information e.g., living area, etc.
Given prepare to Optional: Build variants of the website with very specific user information e.g., living area, etc.
When Try to Optional: Build variants of the website with very specific user information e.g., living area, etc.
# assertion for attack step success
Then Assert the success of Optional: Build variants of the website with very specific user information e.g., living area, etc.
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
