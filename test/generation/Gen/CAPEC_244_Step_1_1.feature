@capec244
Feature: CAPEC-244: Cross-Site Scripting via Encoded URI Schemes 
#1. Explore
Scenario: Step1.1 Survey the application
Given prepare to Survey the application
When Try to Survey the application
# assertion for attack step success
Then Assert the success of Survey the application
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
