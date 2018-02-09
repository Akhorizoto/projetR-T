@capec105
Feature: CAPEC-105: HTTP Request Splitting
#2. Exploit
Scenario: Step2.1 Post a malicious HTTP Request
Given prepare to Post a malicious HTTP Request
When Try to Post a malicious HTTP Request
# assertion for attack step success
Then Assert the success of Post a malicious HTTP Request
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
