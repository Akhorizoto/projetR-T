@capec27
Feature: CAPEC-27: Leveraging Race Conditions via Symbolic Links
#1. Explore
Scenario: Step1.2 Examine application's file I/O behavior
Given prepare to Examine application's file I/O behavior
When Try to Examine application's file I/O behavior
# assertion for attack step success
Then Assert the success of Examine application's file I/O behavior
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
