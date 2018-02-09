@capec141
Feature: CAPEC-141: Cache Poisoning
#2. Experiment
Scenario: Step2.1 Cause specific data to be cached
Given prepare to Cause specific data to be cached
When Try to Cause specific data to be cached
# assertion for attack step success
Then Assert the success of Cause specific data to be cached
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
