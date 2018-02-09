@capec132
Feature: CAPEC-132: Symlink Attack
#1. Explore
Scenario: Step1.1 Identify Target
Given prepare to Identify Target
When Try to Identify Target
# assertion for attack step success
Then Assert the success of Identify Target
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
