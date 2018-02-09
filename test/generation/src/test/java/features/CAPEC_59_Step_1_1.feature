@capec59
Feature: CAPEC-59: Session Credential Falsification through Prediction
#1. Explore
Scenario: Step1.1 Find Session IDs
Given prepare to Find Session IDs
When Try to Find Session IDs
# assertion for attack step success
Then Assert the success of Find Session IDs
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
