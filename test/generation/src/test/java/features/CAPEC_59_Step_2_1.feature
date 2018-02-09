@capec59
Feature: CAPEC-59: Session Credential Falsification through Prediction
#2. Experiment
Scenario: Step2.1 Match issued IDs
Given prepare to Match issued IDs
When Try to Match issued IDs
# assertion for attack step success
Then Assert the success of Match issued IDs
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
