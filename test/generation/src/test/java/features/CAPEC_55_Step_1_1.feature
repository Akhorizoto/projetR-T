@capec55
Feature: CAPEC-55: Rainbow Table Password Cracking
#1. Explore
Scenario: Step1.1 Determine application's/system's password policy
Given prepare to Determine application's/system's password policy
When Try to Determine application's/system's password policy
# assertion for attack step success
Then Assert the success of Determine application's/system's password policy
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
