@capec2
Feature: CAPEC-2: Inducing Account Lockout
#1. Experiment
Scenario: Step1.2 Obtain list of user accounts to lock out
Given prepare to Obtain list of user accounts to lock out
When Try to Obtain list of user accounts to lock out
# assertion for attack step success
Then Assert the success of Obtain list of user accounts to lock out
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
