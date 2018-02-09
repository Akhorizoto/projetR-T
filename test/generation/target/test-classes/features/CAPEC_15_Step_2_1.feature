@capec15
Feature: CAPEC-15: Command Delimiters
#2. Experiment
Scenario: Step2.1 Attempt delimiters in inputs
Given prepare to Attempt delimiters in inputs
When Try to Attempt delimiters in inputs
# assertion for attack step success
Then Assert the success of Attempt delimiters in inputs
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
