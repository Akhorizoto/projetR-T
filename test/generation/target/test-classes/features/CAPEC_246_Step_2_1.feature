@capec246
Feature: CAPEC-246: Cross-Site Scripting Using Flash
#2. Experiment
Scenario: Step2.1 Determine the SWF file susceptibility to XSS
Given prepare to Determine the SWF file susceptibility to XSS
When Try to Determine the SWF file susceptibility to XSS
# assertion for attack step success
Then Assert the success of Determine the SWF file susceptibility to XSS
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
