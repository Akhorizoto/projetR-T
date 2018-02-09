@capec109
Feature: CAPEC-109: Object Relational Mapping Injection
#1. Explore
Scenario: Step1.1 Determine Persistence Framework Used
Given prepare to Determine Persistence Framework Used
When Try to Determine Persistence Framework Used
# assertion for attack step success
Then Assert the success of Determine Persistence Framework Used
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
