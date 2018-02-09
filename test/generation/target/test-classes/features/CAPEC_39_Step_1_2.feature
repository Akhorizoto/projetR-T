@capec39
Feature: CAPEC-39: Manipulating Opaque Client-based Data Tokens
#1. Explore
Scenario: Step1.2 Determine protection mechanism for opaque token
Given prepare to Determine protection mechanism for opaque token
When Try to Determine protection mechanism for opaque token
# assertion for attack step success
Then Assert the success of Determine protection mechanism for opaque token
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
