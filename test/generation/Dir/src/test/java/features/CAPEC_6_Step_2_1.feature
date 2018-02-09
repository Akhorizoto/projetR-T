@capec6
Feature: CAPEC-6: Argument Injection
#2. Experiment
Scenario: Step2.1 1. Attempt variations on argument content
Given prepare to 1. Attempt variations on argument content
When Try to 1. Attempt variations on argument content
# assertion for attack step success
Then Assert the success of 1. Attempt variations on argument content
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern application firewall
           # alternative input guard
Then assert the consequences of the pattern input guard
           # alternative application firewall
Then assert the consequences of the pattern secure logger
