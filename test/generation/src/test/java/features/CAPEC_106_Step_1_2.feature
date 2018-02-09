@capec106
Feature: CAPEC-106: Cross Site Scripting through Log Files
#1. Explore
Scenario: Step1.2 Probe for cross-site scripting vulnerability
Given prepare to Probe for cross-site scripting vulnerability
When Try to Probe for cross-site scripting vulnerability
# assertion for attack step success
Then Assert the success of Probe for cross-site scripting vulnerability
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
