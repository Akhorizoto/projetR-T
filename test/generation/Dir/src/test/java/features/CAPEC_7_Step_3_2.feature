@capec7
Feature: CAPEC-7: Blind SQL Injection
#3. Exploit
Scenario: Step3.2 Exploit SQL Injection vulnerability
Given prepare to Exploit SQL Injection vulnerability
When Try to Exploit SQL Injection vulnerability
# assertion for attack step success
Then Assert the success of Exploit SQL Injection vulnerability
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
