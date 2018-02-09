@capec141
Feature: CAPEC-141: Cache Poisoning
#1. Explore
Scenario: Step1.1 Identify and explore caches
Given prepare to Identify and explore caches
When Try to Identify and explore caches
# assertion for attack step success
Then Assert the success of Identify and explore caches
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
