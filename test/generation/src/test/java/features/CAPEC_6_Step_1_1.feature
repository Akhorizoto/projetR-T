@capec6
Feature: CAPEC-6: Argument Injection
#1. Explore
Scenario: Step1.1 Discovery of potential injection vectors
Given prepare to Discovery of potential injection vectors
When Try to Discovery of potential injection vectors
# assertion for attack step success
Then Assert the success of Discovery of potential injection vectors
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
           # benifits audit interceptor
