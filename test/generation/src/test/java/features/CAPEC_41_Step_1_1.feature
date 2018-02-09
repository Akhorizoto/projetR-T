@capec41
Feature: CAPEC-41: Using Meta-characters in E-mail Headers to Inject Malicious Payloads
#1. Experiment
Scenario: Step1.1 Identify and characterize metacharacter-processing vulnerabilities in email headers
Given prepare to Identify and characterize metacharacter-processing vulnerabilities in email headers
When Try to Identify and characterize metacharacter-processing vulnerabilities in email headers
# assertion for attack step success
Then Assert the success of Identify and characterize metacharacter-processing vulnerabilities in email headers
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern application firewall
           # alternative input guard
Then assert the consequences of the pattern input guard
           # alternative application firewall
Then assert the consequences of the pattern pathname canonicalization
