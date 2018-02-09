@capec55
Feature: CAPEC-55: Rainbow Table Password Cracking
#1. Explore
Scenario: Step1.2 Obtain password hashes
Given prepare to Obtain password hashes
When Try to Obtain password hashes
# assertion for attack step success
Then Assert the success of Obtain password hashes
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
