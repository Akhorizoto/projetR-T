@capec106
Feature: CAPEC-106: Cross Site Scripting through Log Files
#2. Experiment
Scenario: Step2.1 Confirm exploitability
Given prepare to Confirm exploitability
When Try to Confirm exploitability
# assertion for attack step success
Then Assert the success of Confirm exploitability
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
