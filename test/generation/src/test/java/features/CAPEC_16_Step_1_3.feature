@capec16
Feature: CAPEC-16: Dictionary-based Password Attack
#1. Explore
Scenario: Step1.3 Determine username(s) to target
Given prepare to Determine username(s) to target
When Try to Determine username(s) to target
# assertion for attack step success
Then Assert the success of Determine username(s) to target
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
