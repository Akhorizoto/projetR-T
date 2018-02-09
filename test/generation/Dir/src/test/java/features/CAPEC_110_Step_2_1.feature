@capec110
Feature: CAPEC-110: SQL Injection through SOAP Parameter Tampering
#2. Experiment
Scenario: Step2.1 Probe for SQL Injection vulnerability
Given prepare to Probe for SQL Injection vulnerability
When Try to Probe for SQL Injection vulnerability
# assertion for attack step success
Then Assert the success of Probe for SQL Injection vulnerability
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern application firewall
           # alternative input guard
Then assert the consequences of the pattern input guard
           # alternative application firewall
Then assert the consequences of the pattern secure logger
