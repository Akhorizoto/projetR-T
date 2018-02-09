@capec275
Feature: CAPEC-275: DNS Rebinding
#2. Experiment
Scenario: Step2.3 Determine exploitability of DNS rebinding access to target address
Given prepare to Determine exploitability of DNS rebinding access to target address
When Try to Determine exploitability of DNS rebinding access to target address
# assertion for attack step success
Then Assert the success of Determine exploitability of DNS rebinding access to target address
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
Then assert the consequences of the pattern 
           #  
