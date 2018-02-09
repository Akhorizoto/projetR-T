@capec182
Feature: CAPEC-182: Flash Injection
#3. Exploit
Scenario: Step3.1 Inject malicious content into target
Given prepare to Inject malicious content into target
When Try to Inject malicious content into target
# assertion for attack step success
Then Assert the success of Inject malicious content into target
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
