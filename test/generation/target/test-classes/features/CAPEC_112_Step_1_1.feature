@capec112
Feature: CAPEC-112: Brute Force
#1. Explore
Scenario: Step1.1 Determine secret testing procedure
Given prepare to Determine secret testing procedure
When Try to Determine secret testing procedure
# assertion for attack step success
Then Assert the success of Determine secret testing procedure
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
