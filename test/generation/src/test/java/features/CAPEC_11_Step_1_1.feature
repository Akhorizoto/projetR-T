@capec11
Feature: CAPEC-11: Cause Web Server Misclassification
#1. Explore
Scenario: Step1.1 Footprint file input vectors
Given prepare to Footprint file input vectors
When Try to Footprint file input vectors
# assertion for attack step success
Then Assert the success of Footprint file input vectors
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
