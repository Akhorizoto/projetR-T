@capec21
Feature: CAPEC-21: Exploitation of Trusted Credentials
#3. Exploit
Scenario: Step3.2 Spoofing
Given prepare to Spoofing
When Try to Spoofing
# assertion for attack step success
Then Assert the success of Spoofing
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
