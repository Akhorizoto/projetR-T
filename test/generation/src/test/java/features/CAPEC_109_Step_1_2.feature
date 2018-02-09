@capec109
Feature: CAPEC-109: Object Relational Mapping Injection
#1. Explore
Scenario: Step1.2 Probe for ORM Injection vulnerabilities
Given prepare to Probe for ORM Injection vulnerabilities
When Try to Probe for ORM Injection vulnerabilities
# assertion for attack step success
Then Assert the success of Probe for ORM Injection vulnerabilities
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
