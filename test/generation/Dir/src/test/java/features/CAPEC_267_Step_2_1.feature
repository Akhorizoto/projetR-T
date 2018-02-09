@capec267
Feature: CAPEC-267: Leverage Alternate Encoding
#2. Experiment
Scenario: Step2.1 Probe entry points to locate vulnerabilities
Given prepare to Probe entry points to locate vulnerabilities
When Try to Probe entry points to locate vulnerabilities
# assertion for attack step success
Then Assert the success of Probe entry points to locate vulnerabilities
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern application firewall
           # alternative input guard
Then assert the consequences of the pattern input guard
           # alternative application firewall
Then assert the consequences of the pattern pathname canonicalization
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
           # benifits audit interceptor
