@capec31
Feature: CAPEC-31: Accessing/Intercepting/Modifying HTTP Cookies
#2. Experiment
Scenario: Step2.2 Modify cookie to subvert security controls.
Given prepare to Modify cookie to subvert security controls.
When Try to Modify cookie to subvert security controls.
# assertion for attack step success
Then Assert the success of Modify cookie to subvert security controls.
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern secure logger
