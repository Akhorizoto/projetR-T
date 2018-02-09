@capec102
Feature: CAPEC-102: Session Sidejacking
#2. Experiment
Scenario: Step2.2 Insert captured session token
Given prepare to Insert captured session token
When Try to Insert captured session token
# assertion for attack step success
Then Assert the success of Insert captured session token
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
