@capec21
Feature: CAPEC-21: Exploitation of Trusted Credentials
#1. Explore
Scenario: Step1.1 Survey the application for Indicators of Susceptibility
Given prepare to Survey the application for Indicators of Susceptibility
When Try to Survey the application for Indicators of Susceptibility
# assertion for attack step success
Then Assert the success of Survey the application for Indicators of Susceptibility
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
           # benifits audit interceptor
