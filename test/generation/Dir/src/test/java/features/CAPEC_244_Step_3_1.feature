@capec244
Feature: CAPEC-244: Cross-Site Scripting via Encoded URI Schemes 
#3. Exploit
Scenario: Step3.1 Steal session IDs, credentials, page content, etc.
Given prepare to Steal session IDs, credentials, page content, etc.
When Try to Steal session IDs, credentials, page content, etc.
# assertion for attack step success
Then Assert the success of Steal session IDs, credentials, page content, etc.
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
           # benifits audit interceptor
Then assert the consequences of the pattern application firewall
           # alternative output guard
           # alternative input guard
Then assert the consequences of the pattern input guard
           # alternative application firewall
           # benifits output guard
Then assert the consequences of the pattern output guard
           # alternative application firewall
           # benifits input guard
Then assert the consequences of the pattern comparator checked fault tolerant system
           # alternative output guard
           # impairs audit interceptor
