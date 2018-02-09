@capec142
Feature: CAPEC-142: DNS Cache Poisoning
#1. Explore
Scenario: Step1.1 Explore resolver caches
Given prepare to Explore resolver caches
When Try to Explore resolver caches
# assertion for attack step success
Then Assert the success of Explore resolver caches
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
