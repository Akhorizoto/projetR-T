@capec180
Feature: CAPEC-180: Exploiting Incorrectly Configured Access Control Security Levels
#3. Exploit
Scenario: Step3.1 Access the function or data bypassing the access control
Given prepare to Access the function or data bypassing the access control
When Try to Access the function or data bypassing the access control
# assertion for attack step success
Then Assert the success of Access the function or data bypassing the access control
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
