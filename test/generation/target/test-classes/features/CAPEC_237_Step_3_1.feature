@capec237
Feature: CAPEC-237: Calling Signed Code From Another Language Within A Sandbox Allow This 
#3. Exploit
Scenario: Step3.1 Exploit the security weaknesses in the standard libraries
Given prepare to Exploit the security weaknesses in the standard libraries
When Try to Exploit the security weaknesses in the standard libraries
# assertion for attack step success
Then Assert the success of Exploit the security weaknesses in the standard libraries
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
