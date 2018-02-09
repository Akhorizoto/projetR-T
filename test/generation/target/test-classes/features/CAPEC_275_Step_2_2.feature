@capec275
Feature: CAPEC-275: DNS Rebinding
#2. Experiment
Scenario: Step2.2 Rebind DNS resolution to target address
Given prepare to Rebind DNS resolution to target address
When Try to Rebind DNS resolution to target address
# assertion for attack step success
Then Assert the success of Rebind DNS resolution to target address
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
