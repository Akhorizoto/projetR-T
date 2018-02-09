@capec98
Feature: CAPEC-98: Phishing
#2. Exploit
Scenario: Step2.2 Use stolen credentials to log into legitimate site
Given prepare to Use stolen credentials to log into legitimate site
When Try to Use stolen credentials to log into legitimate site
# assertion for attack step success
Then Assert the success of Use stolen credentials to log into legitimate site
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern secure logger
