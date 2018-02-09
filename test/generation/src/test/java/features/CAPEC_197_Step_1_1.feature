@capec197
Feature: CAPEC-197: XML Entity Expansion
#1. Explore
Scenario: Step1.1 Survey the target
Given prepare to Survey the target
When Try to Survey the target
# assertion for attack step success
Then Assert the success of Survey the target
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
