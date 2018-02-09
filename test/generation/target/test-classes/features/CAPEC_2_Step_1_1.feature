@capec2
Feature: CAPEC-2: Inducing Account Lockout
#1. Experiment
Scenario: Step1.1 Investigate account lockout behavior of system
Given prepare to Investigate account lockout behavior of system
When Try to Investigate account lockout behavior of system
# assertion for attack step success
Then Assert the success of Investigate account lockout behavior of system
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
