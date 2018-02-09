@capec197
Feature: CAPEC-197: XML Entity Expansion
#2. Exploit
Scenario: Step2.1 Launch an XML Entity Expansion attack
Given prepare to Launch an XML Entity Expansion attack
When Try to Launch an XML Entity Expansion attack
# assertion for attack step success
Then Assert the success of Launch an XML Entity Expansion attack
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
