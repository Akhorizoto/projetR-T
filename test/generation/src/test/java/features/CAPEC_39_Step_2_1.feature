@capec39
Feature: CAPEC-39: Manipulating Opaque Client-based Data Tokens
#2. Experiment
Scenario: Step2.1 Modify parameter/token values
Given prepare to Modify parameter/token values
When Try to Modify parameter/token values
# assertion for attack step success
Then Assert the success of Modify parameter/token values
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
