@capec178
Feature: CAPEC-178: Cross-Site Flashing
#2. Experiment
Scenario: Step2.1 Attempt to inject a remote flash file
Given prepare to Attempt to inject a remote flash file
When Try to Attempt to inject a remote flash file
# assertion for attack step success
Then Assert the success of Attempt to inject a remote flash file
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
