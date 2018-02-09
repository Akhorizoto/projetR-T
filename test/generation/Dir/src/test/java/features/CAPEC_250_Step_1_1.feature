@capec250
Feature: CAPEC-250: XML Injection
#1. Explore
Scenario: Step1.1 Survey Application
Given prepare to Survey Application
When Try to Survey Application
# assertion for attack step success
Then Assert the success of Survey Application
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
