@capec59
Feature: CAPEC-59: Session Credential Falsification through Prediction
#1. Explore
Scenario: Step1.2 Characterize IDs
Given prepare to Characterize IDs
When Try to Characterize IDs
# assertion for attack step success
Then Assert the success of Characterize IDs
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
