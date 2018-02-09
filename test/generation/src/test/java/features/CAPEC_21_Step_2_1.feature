@capec21
Feature: CAPEC-21: Exploitation of Trusted Credentials
#2. Experiment
Scenario: Step2.1 Fetch samples
Given prepare to Fetch samples
When Try to Fetch samples
# assertion for attack step success
Then Assert the success of Fetch samples
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
