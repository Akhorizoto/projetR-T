@capec6
Feature: CAPEC-6: Argument Injection
#3. Exploit
Scenario: Step3.1 Abuse of the application
Given prepare to Abuse of the application
When Try to Abuse of the application
# assertion for attack step success
Then Assert the success of Abuse of the application
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern application firewall
           # alternative input guard
Then assert the consequences of the pattern input guard
           # alternative application firewall
Then assert the consequences of the pattern secure logger
