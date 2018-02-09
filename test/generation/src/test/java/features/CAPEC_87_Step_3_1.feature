@capec87
Feature: CAPEC-87: Forceful Browsing
#3. Exploit
Scenario: Step3.1 Use unauthorized resources
Given prepare to Use unauthorized resources
When Try to Use unauthorized resources
# assertion for attack step success
Then Assert the success of Use unauthorized resources
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
