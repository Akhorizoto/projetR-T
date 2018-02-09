@capec93
Feature: CAPEC-93: Log Injection-Tampering-Forging
#2. Exploit
Scenario: Step2.1 Manipulate Log Files
Given prepare to Manipulate Log Files
When Try to Manipulate Log Files
# assertion for attack step success
Then Assert the success of Manipulate Log Files
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
Then assert the consequences of the pattern application firewall
           # alternative output guard
           # alternative input guard
Then assert the consequences of the pattern input guard
           # alternative application firewall
           # benifits output guard
Then assert the consequences of the pattern pathname canonicalization
Then assert the consequences of the pattern output guard
           # alternative application firewall
           # benifits input guard
Then assert the consequences of the pattern comparator checked fault tolerant system
           # alternative output guard
