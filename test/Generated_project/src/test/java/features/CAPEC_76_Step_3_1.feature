@capec76
Feature: CAPEC-76: Manipulating Input to File System Calls
#3. Exploit
Scenario: Step3.1 Manipulate files accessible by the application
Given prepare to Manipulate files accessible by the application
When Try to Manipulate files accessible by the application
# assertion for attack step success
Then Assert the success of Manipulate files accessible by the application
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
