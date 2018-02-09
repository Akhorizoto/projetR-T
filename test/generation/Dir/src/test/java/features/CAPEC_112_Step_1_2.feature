@capec112
Feature: CAPEC-112: Brute Force
#1. Explore
Scenario: Step1.2 Reduce search space
Given prepare to Reduce search space
When Try to Reduce search space
# assertion for attack step success
Then Assert the success of Reduce search space
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
