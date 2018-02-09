@capec39
Feature: CAPEC-39: Manipulating Opaque Client-based Data Tokens
#1. Explore
Scenario: Step1.1 Enumerate information passed to client side
Given prepare to Enumerate information passed to client side
When Try to Enumerate information passed to client side
# assertion for attack step success
Then Assert the success of Enumerate information passed to client side
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
