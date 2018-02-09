@capec106
Feature: CAPEC-106: Cross Site Scripting through Log Files
#3. Exploit
Scenario: Step3.1 Inject System Logs with Malicious Scripts
Given prepare to Inject System Logs with Malicious Scripts
When Try to Inject System Logs with Malicious Scripts
# assertion for attack step success
Then Assert the success of Inject System Logs with Malicious Scripts
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
