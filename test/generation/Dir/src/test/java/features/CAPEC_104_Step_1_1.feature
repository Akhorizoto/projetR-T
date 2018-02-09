@capec104
Feature: CAPEC-104: Cross Zone Scripting
#1. Explore
Scenario: Step1.1 Find systems susceptible to the attack
Given prepare to Find systems susceptible to the attack
When Try to Find systems susceptible to the attack
# assertion for attack step success
Then Assert the success of Find systems susceptible to the attack
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
