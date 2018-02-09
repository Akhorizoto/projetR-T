@capec163
Feature: CAPEC-163: Spear Phishing
#3. Exploit
Scenario: Step3.1 Convince user to enter sensitive information on attacker's site.
Given prepare to Convince user to enter sensitive information on attacker's site.
When Try to Convince user to enter sensitive information on attacker's site.
# assertion for attack step success
Then Assert the success of Convince user to enter sensitive information on attacker's site.
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
