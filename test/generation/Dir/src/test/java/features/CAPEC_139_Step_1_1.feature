@capec139
Feature: CAPEC-139: Relative Path Traversal
#1. Explore
Scenario: Step1.1 Survey application
Given prepare to Survey application
When Try to Survey application
# assertion for attack step success
Then Assert the success of Survey application
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
           # benifits audit interceptor
