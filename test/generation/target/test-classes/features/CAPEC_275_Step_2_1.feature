@capec275
Feature: CAPEC-275: DNS Rebinding
#2. Experiment
Scenario: Step2.1 Establish initial target access to attacker DNS
Given prepare to Establish initial target access to attacker DNS
When Try to Establish initial target access to attacker DNS
# assertion for attack step success
Then Assert the success of Establish initial target access to attacker DNS
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
