@capec159
Feature: CAPEC-159: Redirect Access to Libraries
#3. Exploit
Scenario: Step3.1 Redirect the access to libraries to the malicious libraries
Given prepare to Redirect the access to libraries to the malicious libraries
When Try to Redirect the access to libraries to the malicious libraries
# assertion for attack step success
Then Assert the success of Redirect the access to libraries to the malicious libraries
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
