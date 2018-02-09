@capec33
Feature: CAPEC-33: HTTP Request Smuggling
#1. Explore
Scenario: Step1.1 Identify HTTP parsing chain
Given prepare to Identify HTTP parsing chain
When Try to Identify HTTP parsing chain
# assertion for attack step success
Then Assert the success of Identify HTTP parsing chain
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
