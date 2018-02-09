@capec222
Feature: CAPEC-222: iFrame Overlay
#1. Explore
Scenario: Step1.1 Craft an iFrame Overlay page
Given prepare to Craft an iFrame Overlay page
When Try to Craft an iFrame Overlay page
# assertion for attack step success
Then Assert the success of Craft an iFrame Overlay page
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern output guard
Then assert the consequences of the pattern comparator checked fault tolerant system
           # alternative output guard
Then assert the consequences of the pattern secure logger
