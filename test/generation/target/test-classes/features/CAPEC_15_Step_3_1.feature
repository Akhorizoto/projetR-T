@capec15
Feature: CAPEC-15: Command Delimiters
#3. Exploit
Scenario: Step3.1 Use malicious command delimiters
Given prepare to Use malicious command delimiters
When Try to Use malicious command delimiters
# assertion for attack step success
Then Assert the success of Use malicious command delimiters
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
Then assert the consequences of the pattern application firewall
           # alternative input guard
Then assert the consequences of the pattern input guard
           # alternative application firewall
