@capec28
Feature: CAPEC-28: Fuzzing
#2. Experiment
Scenario: Step2.1 Generate fuzzed inputs
Given prepare to Generate fuzzed inputs
When Try to Generate fuzzed inputs
# assertion for attack step success
Then Assert the success of Generate fuzzed inputs
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
