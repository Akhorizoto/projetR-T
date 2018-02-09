@capec18
Feature: CAPEC-18: Embedding Scripts in Non-Script Elements
#2. Experiment
Scenario: Step2.1 Probe identified potential entry points for XSS vulnerability
Given prepare to Probe identified potential entry points for XSS vulnerability
When Try to Probe identified potential entry points for XSS vulnerability
# assertion for attack step success
Then Assert the success of Probe identified potential entry points for XSS vulnerability
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
           # benifits audit interceptor
Then assert the consequences of the pattern application firewall
           # alternative output guard
           # alternative input guard
Then assert the consequences of the pattern input guard
           # alternative application firewall
           # benifits output guard
Then assert the consequences of the pattern output guard
           # alternative application firewall
           # benifits input guard
Then assert the consequences of the pattern comparator checked fault tolerant system
           # alternative output guard
           # impairs audit interceptor
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
