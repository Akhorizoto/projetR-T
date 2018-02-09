@capec16
Feature: CAPEC-16: Dictionary-based Password Attack
#2. Exploit
Scenario: Step2.1 Use dictionary to crack passwords.
Given prepare to Use dictionary to crack passwords.
When Try to Use dictionary to crack passwords.
# assertion for attack step success
Then Assert the success of Use dictionary to crack passwords.
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
