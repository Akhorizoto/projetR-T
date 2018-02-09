@capec147
Feature: CAPEC-147: XML Ping of the Death
#2. Exploit
Scenario: Step2.1 Launch a resource depletion attack
Given prepare to Launch a resource depletion attack
When Try to Launch a resource depletion attack
# assertion for attack step success
Then Assert the success of Launch a resource depletion attack
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
