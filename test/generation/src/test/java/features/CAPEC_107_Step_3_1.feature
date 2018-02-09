@capec107
Feature: CAPEC-107: Cross Site Tracing
#3. Exploit
Scenario: Step3.1 Create a malicious script that pings the web server with HTTP TRACE request
Given prepare to Create a malicious script that pings the web server with HTTP TRACE request
When Try to Create a malicious script that pings the web server with HTTP TRACE request
# assertion for attack step success
Then Assert the success of Create a malicious script that pings the web server with HTTP TRACE request
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
