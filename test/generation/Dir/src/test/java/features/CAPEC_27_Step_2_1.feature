@capec27
Feature: CAPEC-27: Leveraging Race Conditions via Symbolic Links
#2. Experiment
Scenario: Step2.1 Verify ability to write to filesystem
Given prepare to Verify ability to write to filesystem
When Try to Verify ability to write to filesystem
# assertion for attack step success
Then Assert the success of Verify ability to write to filesystem
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
