@capec132
Feature: CAPEC-132: Symlink Attack
#3. Exploit
Scenario: Step3.1 Target application operates on created symlinks to sensitive files
Given prepare to Target application operates on created symlinks to sensitive files
When Try to Target application operates on created symlinks to sensitive files
# assertion for attack step success
Then Assert the success of Target application operates on created symlinks to sensitive files
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
