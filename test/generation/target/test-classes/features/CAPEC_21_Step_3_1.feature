@capec21
Feature: CAPEC-21: Exploitation of Trusted Credentials
#3. Exploit
Scenario: Step3.1 Impersonate
Given prepare to Impersonate
When Try to Impersonate
# assertion for attack step success
Then Assert the success of Impersonate
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
