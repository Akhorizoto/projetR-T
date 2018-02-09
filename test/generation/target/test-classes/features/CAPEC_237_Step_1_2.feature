@capec237
Feature: CAPEC-237: Calling Signed Code From Another Language Within A Sandbox Allow This 
#1. Explore
Scenario: Step1.2 Analysis
Given prepare to Analysis
When Try to Analysis
# assertion for attack step success
Then Assert the success of Analysis
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern secure logger
