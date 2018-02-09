@capec84
Feature: CAPEC-84: XQuery Injection
#3. Exploit
Scenario: Step3.2 Manipulate the data in the XML database
Given prepare to Manipulate the data in the XML database
When Try to Manipulate the data in the XML database
# assertion for attack step success
Then Assert the success of Manipulate the data in the XML database
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
           # benifits audit interceptor
Then assert the consequences of the pattern application firewall
           # alternative input guard
Then assert the consequences of the pattern input guard
           # alternative application firewall
