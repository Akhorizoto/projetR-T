@capec24
Feature: CAPEC-24: Filter Failure through Buffer Overflow
#2. Experiment
Scenario: Step2.1 Attempt injections
Given prepare to Attempt injections
When Try to Attempt injections
# assertion for attack step success
Then Assert the success of Attempt injections
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
Then assert the consequences of the pattern 
           #  
