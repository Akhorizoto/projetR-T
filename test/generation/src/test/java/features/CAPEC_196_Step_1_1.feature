@capec196
Feature: CAPEC-196: Session Credential Falsification through Forging
#1. Explore
Scenario: Step1.1 Analyze and Understand Session IDs
Given prepare to Analyze and Understand Session IDs
When Try to Analyze and Understand Session IDs
# assertion for attack step success
Then Assert the success of Analyze and Understand Session IDs
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
