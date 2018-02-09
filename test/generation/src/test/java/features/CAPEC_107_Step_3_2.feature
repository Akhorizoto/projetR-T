@capec107
Feature: CAPEC-107: Cross Site Tracing
#3. Exploit
Scenario: Step3.2 Execute malicious HTTP Trace launching script
Given prepare to Execute malicious HTTP Trace launching script
When Try to Execute malicious HTTP Trace launching script
# assertion for attack step success
Then Assert the success of Execute malicious HTTP Trace launching script
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
