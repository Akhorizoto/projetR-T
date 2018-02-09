@capec28
Feature: CAPEC-28: Fuzzing
#1. Explore
Scenario: Step1.1 Observe communication and inputs
Given prepare to Observe communication and inputs
When Try to Observe communication and inputs
# assertion for attack step success
Then Assert the success of Observe communication and inputs
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
