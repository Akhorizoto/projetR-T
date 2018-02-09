@capec84
Feature: CAPEC-84: XQuery Injection
#3. Exploit
Scenario: Step3.1 Information Disclosure
Given prepare to Information Disclosure
When Try to Information Disclosure
# assertion for attack step success
Then Assert the success of Information Disclosure
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
           # benifits audit interceptor
Then assert the consequences of the pattern application firewall
           # alternative input guard
Then assert the consequences of the pattern input guard
           # alternative application firewall
