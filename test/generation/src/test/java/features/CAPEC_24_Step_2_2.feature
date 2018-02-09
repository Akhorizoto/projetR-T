@capec24
Feature: CAPEC-24: Filter Failure through Buffer Overflow
#2. Experiment
Scenario: Step2.2 Monitor responses
Given prepare to Monitor responses
When Try to Monitor responses
# assertion for attack step success
Then Assert the success of Monitor responses
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
