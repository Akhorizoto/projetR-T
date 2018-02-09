@capec106
Feature: CAPEC-106: Cross Site Scripting through Log Files
#1. Explore
Scenario: Step1.1 Probe for log injection vulnerability
Given prepare to Probe for log injection vulnerability
When Try to Probe for log injection vulnerability
# assertion for attack step success
Then Assert the success of Probe for log injection vulnerability
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
