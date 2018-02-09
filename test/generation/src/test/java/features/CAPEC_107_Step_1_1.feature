@capec107
Feature: CAPEC-107: Cross Site Tracing
#1. Explore
Scenario: Step1.1 Determine if HTTP Trace is enabled
Given prepare to Determine if HTTP Trace is enabled
When Try to Determine if HTTP Trace is enabled
# assertion for attack step success
Then Assert the success of Determine if HTTP Trace is enabled
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
