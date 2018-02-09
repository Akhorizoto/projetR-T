@capec15
Feature: CAPEC-15: Command Delimiters
#1. Explore
Scenario: Step1.1 Assess Target Runtime Environment
Given prepare to Assess Target Runtime Environment
When Try to Assess Target Runtime Environment
# assertion for attack step success
Then Assert the success of Assess Target Runtime Environment
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern secure logger
