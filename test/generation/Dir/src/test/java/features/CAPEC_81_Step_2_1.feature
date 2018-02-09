@capec81
Feature: CAPEC-81: Web Logs Tampering
#2. Experiment
Scenario: Step2.1 Determine Injectable Content
Given prepare to Determine Injectable Content
When Try to Determine Injectable Content
# assertion for attack step success
Then Assert the success of Determine Injectable Content
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
