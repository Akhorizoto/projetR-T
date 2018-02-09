@capec178
Feature: CAPEC-178: Cross-Site Flashing
#3. Exploit
Scenario: Step3.2 Execute JavaScript in victim's browser
Given prepare to Execute JavaScript in victim's browser
When Try to Execute JavaScript in victim's browser
# assertion for attack step success
Then Assert the success of Execute JavaScript in victim's browser
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern output guard
Then assert the consequences of the pattern comparator checked fault tolerant system
           # alternative output guard
