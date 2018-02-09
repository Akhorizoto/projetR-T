@capec196
Feature: CAPEC-196: Session Credential Falsification through Forging
#2. Experiment
Scenario: Step2.1 Create Session IDs.
Given prepare to Create Session IDs.
When Try to Create Session IDs.
# assertion for attack step success
Then Assert the success of Create Session IDs.
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
