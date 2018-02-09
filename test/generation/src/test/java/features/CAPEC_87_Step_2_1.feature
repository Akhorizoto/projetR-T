@capec87
Feature: CAPEC-87: Forceful Browsing
#2. Experiment
Scenario: Step2.1 Attempt well-known or guessable resource locations
Given prepare to Attempt well-known or guessable resource locations
When Try to Attempt well-known or guessable resource locations
# assertion for attack step success
Then Assert the success of Attempt well-known or guessable resource locations
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
           # benifits audit interceptor
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
