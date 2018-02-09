@capec43
Feature: CAPEC-43: Exploiting Multiple Input Interpretation Layers
#3. Exploit
Scenario: Step3.1 Leverage ability to bypass input validation
Given prepare to Leverage ability to bypass input validation
When Try to Leverage ability to bypass input validation
# assertion for attack step success
Then Assert the success of Leverage ability to bypass input validation
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
