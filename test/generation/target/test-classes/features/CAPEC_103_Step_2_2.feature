@capec103
Feature: CAPEC-103: Clickjacking
#2. Exploit
Scenario: Step2.2 Trick victim into interacting with the clickjacking page in the desired manner
Given prepare to Trick victim into interacting with the clickjacking page in the desired manner
When Try to Trick victim into interacting with the clickjacking page in the desired manner
# assertion for attack step success
Then Assert the success of Trick victim into interacting with the clickjacking page in the desired manner
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
