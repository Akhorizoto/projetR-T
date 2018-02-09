@capec15
Feature: CAPEC-15: Command Delimiters
#1. Explore
Scenario: Step1.2 Survey the Application
Given prepare to Survey the Application
When Try to Survey the Application
# assertion for attack step success
Then Assert the success of Survey the Application
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
           # benifits audit interceptor
