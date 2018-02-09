@capec219
Feature: CAPEC-219: XML Routing Detour Attacks
#2. Experiment
Scenario: Step2.1 Identify SOAP messages that have multiple state processing.
Given prepare to Identify SOAP messages that have multiple state processing.
When Try to Identify SOAP messages that have multiple state processing.
# assertion for attack step success
Then Assert the success of Identify SOAP messages that have multiple state processing.
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
