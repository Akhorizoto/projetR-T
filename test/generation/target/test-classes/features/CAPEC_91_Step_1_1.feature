@capec91
Feature: CAPEC-91: XSS in IMG Tags
#1. Explore
Scenario: Step1.1 Spider
Given prepare to Spider
When Try to Spider
# assertion for attack step success
Then Assert the success of Spider
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
