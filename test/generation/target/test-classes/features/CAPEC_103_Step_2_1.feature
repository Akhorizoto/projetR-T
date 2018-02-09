@capec103
Feature: CAPEC-103: Clickjacking
#2. Exploit
Scenario: Step2.1 Attacker lures victim to clickjacking page
Given prepare to Attacker lures victim to clickjacking page
When Try to Attacker lures victim to clickjacking page
# assertion for attack step success
Then Assert the success of Attacker lures victim to clickjacking page
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
