@capec43
Feature: CAPEC-43: Exploiting Multiple Input Interpretation Layers
#1. Explore
Scenario: Step1.1 Determine application/system inputs where bypassing input validation is desired
Given prepare to Determine application/system inputs where bypassing input validation is desired
When Try to Determine application/system inputs where bypassing input validation is desired
# assertion for attack step success
Then Assert the success of Determine application/system inputs where bypassing input validation is desired
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
