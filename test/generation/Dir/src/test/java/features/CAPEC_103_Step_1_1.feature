@capec103
Feature: CAPEC-103: Clickjacking
#1. Experiment
Scenario: Step1.1 Craft a clickjacking page
Given prepare to Craft a clickjacking page
When Try to Craft a clickjacking page
# assertion for attack step success
Then Assert the success of Craft a clickjacking page
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern output guard
Then assert the consequences of the pattern comparator checked fault tolerant system
           # alternative output guard
