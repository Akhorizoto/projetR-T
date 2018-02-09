@capec142
Feature: CAPEC-142: DNS Cache Poisoning
#2. Experiment
Scenario: Step2.1 Attempt sending crafted records to DNS cache
Given prepare to Attempt sending crafted records to DNS cache
When Try to Attempt sending crafted records to DNS cache
# assertion for attack step success
Then Assert the success of Attempt sending crafted records to DNS cache
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
