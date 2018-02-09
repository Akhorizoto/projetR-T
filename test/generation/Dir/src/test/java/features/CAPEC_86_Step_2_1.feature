@capec86
Feature: CAPEC-86: Embedding Script (XSS) in HTTP Headers
#2. Experiment
Scenario: Step2.1 Probe identified potential entry points for XSS vulnerability
Given prepare to Probe identified potential entry points for XSS vulnerability
When Try to Probe identified potential entry points for XSS vulnerability
# assertion for attack step success
Then Assert the success of Probe identified potential entry points for XSS vulnerability
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
           # benifits audit interceptor
Then assert the consequences of the pattern application firewall
           # alternative input guard
Then assert the consequences of the pattern input guard
           # alternative application firewall
