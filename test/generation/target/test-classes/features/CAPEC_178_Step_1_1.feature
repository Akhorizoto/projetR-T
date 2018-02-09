@capec178
Feature: CAPEC-178: Cross-Site Flashing
#1. Explore
Scenario: Step1.1 Identification
Given prepare to Identification
When Try to Identification
# assertion for attack step success
Then Assert the success of Identification
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
