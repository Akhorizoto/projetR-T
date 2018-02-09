@capec76
Feature: CAPEC-76: Manipulating Input to File System Calls
#1. Explore
Scenario: Step1.2 Survey the Application to Identify User-controllable Inputs
Given prepare to Survey the Application to Identify User-controllable Inputs
When Try to Survey the Application to Identify User-controllable Inputs
# assertion for attack step success
Then Assert the success of Survey the Application to Identify User-controllable Inputs
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
           # benifits audit interceptor
