@capec193
Feature: CAPEC-193: PHP Remote File Inclusion
#3. Exploit
Scenario: Step3.1 Run arbitrary server-side code
Given prepare to Run arbitrary server-side code
When Try to Run arbitrary server-side code
# assertion for attack step success
Then Assert the success of Run arbitrary server-side code
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
Then assert the consequences of the pattern application firewall
           # alternative input guard
Then assert the consequences of the pattern input guard
           # alternative application firewall
Then assert the consequences of the pattern 
           #  
