@capec110
Feature: CAPEC-110: SQL Injection through SOAP Parameter Tampering
#1. Explore
Scenario: Step1.1 Detect Incorrect SOAP Parameter Handling
Given prepare to Detect Incorrect SOAP Parameter Handling
When Try to Detect Incorrect SOAP Parameter Handling
# assertion for attack step success
Then Assert the success of Detect Incorrect SOAP Parameter Handling
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
