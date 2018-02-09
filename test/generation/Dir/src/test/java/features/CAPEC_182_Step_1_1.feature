@capec182
Feature: CAPEC-182: Flash Injection
#1. Explore
Scenario: Step1.1 Find Injection Entry Points
Given prepare to Find Injection Entry Points
When Try to Find Injection Entry Points
# assertion for attack step success
Then Assert the success of Find Injection Entry Points
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
