@capec88
Feature: CAPEC-88: OS Command Injection
#1. Explore
Scenario: Step1.1 Identify inputs for OS commands
Given prepare to Identify inputs for OS commands
When Try to Identify inputs for OS commands
# assertion for attack step success
Then Assert the success of Identify inputs for OS commands
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern secure logger
