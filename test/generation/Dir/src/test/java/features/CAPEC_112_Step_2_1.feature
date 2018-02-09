@capec112
Feature: CAPEC-112: Brute Force
#2. Exploit
Scenario: Step2.1 Gather information so attack can be performed independently.
Given prepare to Gather information so attack can be performed independently.
When Try to Gather information so attack can be performed independently.
# assertion for attack step success
Then Assert the success of Gather information so attack can be performed independently.
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
