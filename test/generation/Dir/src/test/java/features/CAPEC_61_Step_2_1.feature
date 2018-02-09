@capec61
Feature: CAPEC-61: Session Fixation
#2. Experiment
Scenario: Step2.1 Attract a Victim
Given prepare to Attract a Victim
When Try to Attract a Victim
# assertion for attack step success
Then Assert the success of Attract a Victim
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
