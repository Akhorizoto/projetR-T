@capec88
Feature: CAPEC-88: OS Command Injection
#3. Exploit
Scenario: Step3.1 Execute malicious commands
Given prepare to Execute malicious commands
When Try to Execute malicious commands
# assertion for attack step success
Then Assert the success of Execute malicious commands
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
