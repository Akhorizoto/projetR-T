@capec87
Feature: CAPEC-87: Forceful Browsing
#3. Exploit
Scenario: Step3.2 View unauthorized data
Given prepare to View unauthorized data
When Try to View unauthorized data
# assertion for attack step success
Then Assert the success of View unauthorized data
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
