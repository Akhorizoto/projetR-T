@capec207
Feature: CAPEC-207: Removing Important Client Functionality
#1. Explore
Scenario: Step1.1 Probing
Given prepare to Probing
When Try to Probing
# assertion for attack step success
Then Assert the success of Probing
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
