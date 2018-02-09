@capec237
Feature: CAPEC-237: Calling Signed Code From Another Language Within A Sandbox Allow This 
#1. Explore
Scenario: Step1.1 Probing
Given prepare to Probing
When Try to Probing
# assertion for attack step success
Then Assert the success of Probing
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
