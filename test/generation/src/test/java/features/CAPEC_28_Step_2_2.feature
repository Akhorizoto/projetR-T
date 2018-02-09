@capec28
Feature: CAPEC-28: Fuzzing
#2. Experiment
Scenario: Step2.2 Observe the outcome
Given prepare to Observe the outcome
When Try to Observe the outcome
# assertion for attack step success
Then Assert the success of Observe the outcome
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
