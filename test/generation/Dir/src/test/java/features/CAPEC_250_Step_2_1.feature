@capec250
Feature: CAPEC-250: XML Injection
#2. Experiment
Scenario: Step2.1 Test user-controllable inputs for injection
Given prepare to Test user-controllable inputs for injection
When Try to Test user-controllable inputs for injection
# assertion for attack step success
Then Assert the success of Test user-controllable inputs for injection
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
