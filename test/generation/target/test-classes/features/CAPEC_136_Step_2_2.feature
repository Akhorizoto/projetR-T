@capec136
Feature: CAPEC-136: LDAP Injection
#2. Experiment
Scenario: Step2.2 Try to exploit the LDAP injection vulnerability
Given prepare to Try to exploit the LDAP injection vulnerability
When Try to Try to exploit the LDAP injection vulnerability
# assertion for attack step success
Then Assert the success of Try to exploit the LDAP injection vulnerability
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern application firewall
           # alternative input guard
Then assert the consequences of the pattern input guard
           # alternative application firewall
