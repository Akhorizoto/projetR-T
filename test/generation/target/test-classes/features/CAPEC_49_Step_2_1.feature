@capec49
Feature: CAPEC-49: Password Brute Forcing
#2. Exploit
Scenario: Step2.1 Brute force password
Given prepare to Brute force password
When Try to Brute force password
# assertion for attack step success
Then Assert the success of Brute force password
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
Then assert the consequences of the pattern 
           #  
