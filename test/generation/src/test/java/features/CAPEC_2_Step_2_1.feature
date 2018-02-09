@capec2
Feature: CAPEC-2: Inducing Account Lockout
#2. Exploit
Scenario: Step2.1 Lock Out Accounts
Given prepare to Lock Out Accounts
When Try to Lock Out Accounts
# assertion for attack step success
Then Assert the success of Lock Out Accounts
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
