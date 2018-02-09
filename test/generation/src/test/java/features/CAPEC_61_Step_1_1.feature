@capec61
Feature: CAPEC-61: Session Fixation
#1. Explore
Scenario: Step1.1 Setup the Attack
Given prepare to Setup the Attack
When Try to Setup the Attack
# assertion for attack step success
Then Assert the success of Setup the Attack
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
           # benifits audit interceptor
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
