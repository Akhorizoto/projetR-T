@capec163
Feature: CAPEC-163: Spear Phishing
#3. Exploit
Scenario: Step3.2 Use stolen credentials to log into legitimate site
Given prepare to Use stolen credentials to log into legitimate site
When Try to Use stolen credentials to log into legitimate site
# assertion for attack step success
Then Assert the success of Use stolen credentials to log into legitimate site
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern secure logger
