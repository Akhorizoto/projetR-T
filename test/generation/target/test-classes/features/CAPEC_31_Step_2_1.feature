@capec31
Feature: CAPEC-31: Accessing/Intercepting/Modifying HTTP Cookies
#2. Experiment
Scenario: Step2.1 Obtain sensitive information from cookie
Given prepare to Obtain sensitive information from cookie
When Try to Obtain sensitive information from cookie
# assertion for attack step success
Then Assert the success of Obtain sensitive information from cookie
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
