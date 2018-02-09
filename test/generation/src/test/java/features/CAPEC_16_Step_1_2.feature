@capec16
Feature: CAPEC-16: Dictionary-based Password Attack
#1. Explore
Scenario: Step1.2 Select dictionaries
Given prepare to Select dictionaries
When Try to Select dictionaries
# assertion for attack step success
Then Assert the success of Select dictionaries
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
