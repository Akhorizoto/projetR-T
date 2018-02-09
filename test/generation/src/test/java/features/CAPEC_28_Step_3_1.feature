@capec28
Feature: CAPEC-28: Fuzzing
#3. Exploit
Scenario: Step3.1 Craft exploit payloads
Given prepare to Craft exploit payloads
When Try to Craft exploit payloads
# assertion for attack step success
Then Assert the success of Craft exploit payloads
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
