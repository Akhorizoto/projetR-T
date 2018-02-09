@capec111
Feature: CAPEC-111: JSON Hijacking (aka JavaScript Hijacking)
#1. Explore
Scenario: Step1.1 Understand How to Request JSON Responses from the Target System
Given prepare to Understand How to Request JSON Responses from the Target System
When Try to Understand How to Request JSON Responses from the Target System
# assertion for attack step success
Then Assert the success of Understand How to Request JSON Responses from the Target System
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
