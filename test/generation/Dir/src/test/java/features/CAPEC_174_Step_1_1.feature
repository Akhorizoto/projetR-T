@capec174
Feature: CAPEC-174: Flash Parameter Injection
#1. Explore
Scenario: Step1.1 Spider
Given prepare to Spider
When Try to Spider
# assertion for attack step success
Then Assert the success of Spider
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
