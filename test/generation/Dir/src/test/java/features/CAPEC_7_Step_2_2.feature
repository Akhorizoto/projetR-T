@capec7
Feature: CAPEC-7: Blind SQL Injection
#2. Experiment
Scenario: Step2.2 Determine database type
Given prepare to Determine database type
When Try to Determine database type
# assertion for attack step success
Then Assert the success of Determine database type
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
