@capec81
Feature: CAPEC-81: Web Logs Tampering
#1. Explore
Scenario: Step1.1 Determine Application Web Server Log File Format
Given prepare to Determine Application Web Server Log File Format
When Try to Determine Application Web Server Log File Format
# assertion for attack step success
Then Assert the success of Determine Application Web Server Log File Format
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
