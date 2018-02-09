@capec159
Feature: CAPEC-159: Redirect Access to Libraries
#1. Explore
Scenario: Step1.1 Identify target general susceptibility
Given prepare to Identify target general susceptibility
When Try to Identify target general susceptibility
# assertion for attack step success
Then Assert the success of Identify target general susceptibility
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
