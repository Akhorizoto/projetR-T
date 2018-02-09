@capec107
Feature: CAPEC-107: Cross Site Tracing
#2. Experiment
Scenario: Step2.1 Identify mechanism to launch HTTP Trace request
Given prepare to Identify mechanism to launch HTTP Trace request
When Try to Identify mechanism to launch HTTP Trace request
# assertion for attack step success
Then Assert the success of Identify mechanism to launch HTTP Trace request
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
