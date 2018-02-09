@capec7
Feature: CAPEC-7: Blind SQL Injection
#1. Explore
Scenario: Step1.2 Determine how to inject information into the queries
Given prepare to Determine how to inject information into the queries
When Try to Determine how to inject information into the queries
# assertion for attack step success
Then Assert the success of Determine how to inject information into the queries
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
