@capec132
Feature: CAPEC-132: Symlink Attack
#2. Experiment
Scenario: Step2.1 Try to create symlinks to different files
Given prepare to Try to create symlinks to different files
When Try to Try to create symlinks to different files
# assertion for attack step success
Then Assert the success of Try to create symlinks to different files
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
