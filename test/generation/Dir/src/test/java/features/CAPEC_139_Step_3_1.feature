@capec139
Feature: CAPEC-139: Relative Path Traversal
#3. Exploit
Scenario: Step3.1 Access, modify, or execute arbitrary files.
Given prepare to Access, modify, or execute arbitrary files.
When Try to Access, modify, or execute arbitrary files.
# assertion for attack step success
Then Assert the success of Access, modify, or execute arbitrary files.
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
Then assert the consequences of the pattern application firewall
           # alternative input guard
Then assert the consequences of the pattern input guard
           # alternative application firewall
