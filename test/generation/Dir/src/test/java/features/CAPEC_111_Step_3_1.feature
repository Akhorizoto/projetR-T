@capec111
Feature: CAPEC-111: JSON Hijacking (aka JavaScript Hijacking)
#3. Exploit
Scenario: Step3.1 Launch JSON hijack
Given prepare to Launch JSON hijack
When Try to Launch JSON hijack
# assertion for attack step success
Then Assert the success of Launch JSON hijack
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
