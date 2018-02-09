@capec24
Feature: CAPEC-24: Filter Failure through Buffer Overflow
#3. Exploit
Scenario: Step3.1 Abuse the system through filter failure
Given prepare to Abuse the system through filter failure
When Try to Abuse the system through filter failure
# assertion for attack step success
Then Assert the success of Abuse the system through filter failure
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
