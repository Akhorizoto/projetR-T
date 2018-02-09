@capec196
Feature: CAPEC-196: Session Credential Falsification through Forging
#3. Exploit
Scenario: Step3.1 Abuse the Victim's Session Credentials
Given prepare to Abuse the Victim's Session Credentials
When Try to Abuse the Victim's Session Credentials
# assertion for attack step success
Then Assert the success of Abuse the Victim's Session Credentials
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
           # benifits audit interceptor
Then assert the consequences of the pattern application firewall
           # alternative input guard
Then assert the consequences of the pattern input guard
           # alternative application firewall
