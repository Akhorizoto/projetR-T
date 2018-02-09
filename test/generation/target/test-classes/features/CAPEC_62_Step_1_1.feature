@capec62
Feature: CAPEC-62: Cross Site Request Forgery (aka Session Riding)
#1. Explore
Scenario: Step1.1 Explore target website
Given prepare to Explore target website
When Try to Explore target website
# assertion for attack step success
Then Assert the success of Explore target website
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
