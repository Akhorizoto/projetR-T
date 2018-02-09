@capec178
Feature: CAPEC-178: Cross-Site Flashing
#3. Exploit
Scenario: Step3.1 Access or Modify Flash Application Variables
Given prepare to Access or Modify Flash Application Variables
When Try to Access or Modify Flash Application Variables
# assertion for attack step success
Then Assert the success of Access or Modify Flash Application Variables
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern output guard
Then assert the consequences of the pattern comparator checked fault tolerant system
           # alternative output guard
