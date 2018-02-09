@capec207
Feature: CAPEC-207: Removing Important Client Functionality
#3. Exploit
Scenario: Step3.1 Disable or remove the critical functionality from the client code
Given prepare to Disable or remove the critical functionality from the client code
When Try to Disable or remove the critical functionality from the client code
# assertion for attack step success
Then Assert the success of Disable or remove the critical functionality from the client code
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern secure logger
