@capec244
Feature: CAPEC-244: Cross-Site Scripting via Encoded URI Schemes 
#3. Exploit
Scenario: Step3.3 Content spoofing
Given prepare to Content spoofing
When Try to Content spoofing
# assertion for attack step success
Then Assert the success of Content spoofing
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
