@capec37
Feature: CAPEC-37: Retrieve Embedded Sensitive Data
#2. Experiment
Scenario: Step2.1 Apply mining techniques
Given prepare to Apply mining techniques
When Try to Apply mining techniques
# assertion for attack step success
Then Assert the success of Apply mining techniques
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
