@capec24
Feature: CAPEC-24: Filter Failure through Buffer Overflow
#1. Explore
Scenario: Step1.1 Survey
Given prepare to Survey
When Try to Survey
# assertion for attack step success
Then Assert the success of Survey
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
