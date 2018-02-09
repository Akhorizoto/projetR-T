@capec142
Feature: CAPEC-142: DNS Cache Poisoning
#3. Exploit
Scenario: Step3.1 Redirect users to malicious website
Given prepare to Redirect users to malicious website
When Try to Redirect users to malicious website
# assertion for attack step success
Then Assert the success of Redirect users to malicious website
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
Then assert the consequences of the pattern 
           #  
