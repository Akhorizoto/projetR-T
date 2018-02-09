@capec66
Feature: CAPEC-66: SQL Injection
#2. Experiment
Scenario: Step2.2 Experiment and try to exploit SQL Injection vulnerability
Given prepare to Experiment and try to exploit SQL Injection vulnerability
When Try to Experiment and try to exploit SQL Injection vulnerability
# assertion for attack step success
Then Assert the success of Experiment and try to exploit SQL Injection vulnerability
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
