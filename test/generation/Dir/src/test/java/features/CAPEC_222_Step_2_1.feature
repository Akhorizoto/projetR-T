@capec222
Feature: CAPEC-222: iFrame Overlay
#2. Exploit
Scenario: Step2.1 Attacker tricks victim to load the iFrame overlay page
Given prepare to Attacker tricks victim to load the iFrame overlay page
When Try to Attacker tricks victim to load the iFrame overlay page
# assertion for attack step success
Then Assert the success of Attacker tricks victim to load the iFrame overlay page
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern output guard
Then assert the consequences of the pattern comparator checked fault tolerant system
           # alternative output guard
