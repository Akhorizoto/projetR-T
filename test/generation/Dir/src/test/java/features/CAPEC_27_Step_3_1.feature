@capec27
Feature: CAPEC-27: Leveraging Race Conditions via Symbolic Links
#3. Exploit
Scenario: Step3.1 Replace file with a symlink to a sensitive system file.
Given prepare to Replace file with a symlink to a sensitive system file.
When Try to Replace file with a symlink to a sensitive system file.
# assertion for attack step success
Then Assert the success of Replace file with a symlink to a sensitive system file.
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
