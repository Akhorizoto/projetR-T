@capec1
Feature: CAPEC-1: Accessing Functionality Not Properly Constrained by ACLs
#2. Experiment
Scenario: Step2.1 Iterate over access capabilities
Given prepare to Iterate over access capabilities
When Try to Iterate over access capabilities
# assertion for attack step success
Then Assert the success of Iterate over access capabilities
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
