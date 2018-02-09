@capec108
Feature: CAPEC-108: Command Line Execution through SQL Injection
#2. Exploit
Scenario: Step2.2 Inject malicious data in the database
Given prepare to Inject malicious data in the database
When Try to Inject malicious data in the database
# assertion for attack step success
Then Assert the success of Inject malicious data in the database
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern application firewall
           # alternative input guard
Then assert the consequences of the pattern input guard
           # alternative application firewall
Then assert the consequences of the pattern secure logger
