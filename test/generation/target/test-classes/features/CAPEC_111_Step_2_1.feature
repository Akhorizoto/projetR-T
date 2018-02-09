@capec111
Feature: CAPEC-111: JSON Hijacking (aka JavaScript Hijacking)
#2. Experiment
Scenario: Step2.1 Craft a malicious website
Given prepare to Craft a malicious website
When Try to Craft a malicious website
# assertion for attack step success
Then Assert the success of Craft a malicious website
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
