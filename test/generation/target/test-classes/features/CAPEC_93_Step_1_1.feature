@capec93
Feature: CAPEC-93: Log Injection-Tampering-Forging
#1. Explore
Scenario: Step1.1 Determine Application's Log File Format
Given prepare to Determine Application's Log File Format
When Try to Determine Application's Log File Format
# assertion for attack step success
Then Assert the success of Determine Application's Log File Format
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
