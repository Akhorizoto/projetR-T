@capec127
Feature: CAPEC-127: Directory Indexing
#1. Explore
Scenario: Step1.1 Directory Discovery
Given prepare to Directory Discovery
When Try to Directory Discovery
# assertion for attack step success
Then Assert the success of Directory Discovery
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
           # benifits audit interceptor
