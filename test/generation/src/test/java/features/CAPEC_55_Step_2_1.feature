@capec55
Feature: CAPEC-55: Rainbow Table Password Cracking
#2. Exploit
Scenario: Step2.1 Run rainbow table-based password cracking tool
Given prepare to Run rainbow table-based password cracking tool
When Try to Run rainbow table-based password cracking tool
# assertion for attack step success
Then Assert the success of Run rainbow table-based password cracking tool
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
