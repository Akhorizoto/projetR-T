@capec102
Feature: CAPEC-102: Session Sidejacking
#1. Explore
Scenario: Step1.1 Detect Unprotected Session Token Transfer
Given prepare to Detect Unprotected Session Token Transfer
When Try to Detect Unprotected Session Token Transfer
# assertion for attack step success
Then Assert the success of Detect Unprotected Session Token Transfer
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
