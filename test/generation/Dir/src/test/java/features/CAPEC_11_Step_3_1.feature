@capec11
Feature: CAPEC-11: Cause Web Server Misclassification
#3. Exploit
Scenario: Step3.1 Disclose information
Given prepare to Disclose information
When Try to Disclose information
# assertion for attack step success
Then Assert the success of Disclose information
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern application firewall
           # alternative input guard
Then assert the consequences of the pattern input guard
           # alternative application firewall
Then assert the consequences of the pattern pathname canonicalization
