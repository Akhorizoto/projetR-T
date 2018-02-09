@capec108
Feature: CAPEC-108: Command Line Execution through SQL Injection
#2. Exploit
Scenario: Step2.3 Trigger command line execution with injected arguments
Given prepare to Trigger command line execution with injected arguments
When Try to Trigger command line execution with injected arguments
# assertion for attack step success
Then Assert the success of Trigger command line execution with injected arguments
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
