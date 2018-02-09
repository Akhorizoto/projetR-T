@capec105
Feature: CAPEC-105: HTTP Request Splitting
#1. Explore
Scenario: Step1.1 Investigate Target Environment
Given prepare to Investigate Target Environment
When Try to Investigate Target Environment
# assertion for attack step success
Then Assert the success of Investigate Target Environment
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
