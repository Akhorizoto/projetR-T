@capec219
Feature: CAPEC-219: XML Routing Detour Attacks
#3. Exploit
Scenario: Step3.1 Launch an XML routing detour attack
Given prepare to Launch an XML routing detour attack
When Try to Launch an XML routing detour attack
# assertion for attack step success
Then Assert the success of Launch an XML routing detour attack
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
