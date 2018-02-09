@capec102
Feature: CAPEC-102: Session Sidejacking
#3. Exploit
Scenario: Step3.1 Session Token Exploitation
Given prepare to Session Token Exploitation
When Try to Session Token Exploitation
# assertion for attack step success
Then Assert the success of Session Token Exploitation
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
