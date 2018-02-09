@capec112
Feature: CAPEC-112: Brute Force
#1. Explore
Scenario: Step1.3 Expand victory conditions
Given prepare to Expand victory conditions
When Try to Expand victory conditions
# assertion for attack step success
Then Assert the success of Expand victory conditions
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
