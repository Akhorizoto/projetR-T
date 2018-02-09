@capec104
Feature: CAPEC-104: Cross Zone Scripting
#2. Experiment
Scenario: Step2.1 Find the insertion point for the payload
Given prepare to Find the insertion point for the payload
When Try to Find the insertion point for the payload
# assertion for attack step success
Then Assert the success of Find the insertion point for the payload
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
