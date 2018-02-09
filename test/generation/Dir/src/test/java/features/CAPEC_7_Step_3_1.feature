@capec7
Feature: CAPEC-7: Blind SQL Injection
#3. Exploit
Scenario: Step3.1 Extract information about database schema
Given prepare to Extract information about database schema
When Try to Extract information about database schema
# assertion for attack step success
Then Assert the success of Extract information about database schema
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
