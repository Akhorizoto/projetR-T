@capec275
Feature: CAPEC-275: DNS Rebinding
#1. Explore
Scenario: Step1.1 Identify potential DNS rebinding targets
Given prepare to Identify potential DNS rebinding targets
When Try to Identify potential DNS rebinding targets
# assertion for attack step success
Then Assert the success of Identify potential DNS rebinding targets
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
