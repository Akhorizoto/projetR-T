@capec159
Feature: CAPEC-159: Redirect Access to Libraries
#2. Experiment
Scenario: Step2.1 Craft malicious libraries
Given prepare to Craft malicious libraries
When Try to Craft malicious libraries
# assertion for attack step success
Then Assert the success of Craft malicious libraries
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
