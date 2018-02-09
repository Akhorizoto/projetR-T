@capec27
Feature: CAPEC-27: Leveraging Race Conditions via Symbolic Links
#1. Explore
Scenario: Step1.1 Verify that target host's platform supports symbolic links.
Given prepare to Verify that target host's platform supports symbolic links.
When Try to Verify that target host's platform supports symbolic links.
# assertion for attack step success
Then Assert the success of Verify that target host's platform supports symbolic links.
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
