@capec7
Feature: CAPEC-7: Blind SQL Injection
#2. Experiment
Scenario: Step2.1 Determine user-controllable input susceptible to injection
Given prepare to Determine user-controllable input susceptible to injection
When Try to Determine user-controllable input susceptible to injection
# assertion for attack step success
Then Assert the success of Determine user-controllable input susceptible to injection
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
Then assert the consequences of the pattern application firewall
           # alternative input guard
Then assert the consequences of the pattern input guard
           # alternative application firewall
Then assert the consequences of the pattern 
           #  
