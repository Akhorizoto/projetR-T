@capec237
Feature: CAPEC-237: Calling Signed Code From Another Language Within A Sandbox Allow This 
#2. Experiment
Scenario: Step2.1 Verify the exploitable security weaknesses
Given prepare to Verify the exploitable security weaknesses
When Try to Verify the exploitable security weaknesses
# assertion for attack step success
Then Assert the success of Verify the exploitable security weaknesses
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
