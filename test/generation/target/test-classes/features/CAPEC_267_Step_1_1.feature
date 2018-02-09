@capec267
Feature: CAPEC-267: Leverage Alternate Encoding
#1. Explore
Scenario: Step1.1 Survey the application for user-controllable inputs
Given prepare to Survey the application for user-controllable inputs
When Try to Survey the application for user-controllable inputs
# assertion for attack step success
Then Assert the success of Survey the application for user-controllable inputs
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
           # benifits audit interceptor
