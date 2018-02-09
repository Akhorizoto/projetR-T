@capec110
Feature: CAPEC-110: SQL Injection through SOAP Parameter Tampering
#3. Exploit
Scenario: Step3.1 Inject SQL via SOAP Parameters
Given prepare to Inject SQL via SOAP Parameters
When Try to Inject SQL via SOAP Parameters
# assertion for attack step success
Then Assert the success of Inject SQL via SOAP Parameters
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
