@capec170
Feature: CAPEC-170: Web Application Fingerprinting
#1. Explore
Scenario: Step1.1 Request fingerprinting
Given prepare to Request fingerprinting
When Try to Request fingerprinting
# assertion for attack step success
Then Assert the success of Request fingerprinting
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
