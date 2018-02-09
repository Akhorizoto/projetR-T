@capec109
Feature: CAPEC-109: Object Relational Mapping Injection
#2. Exploit
Scenario: Step2.1 Perform SQL Injection through the generated data access layer
Given prepare to Perform SQL Injection through the generated data access layer
When Try to Perform SQL Injection through the generated data access layer
# assertion for attack step success
Then Assert the success of Perform SQL Injection through the generated data access layer
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
