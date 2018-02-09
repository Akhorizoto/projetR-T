@capec101
Feature: CAPEC-101: Server Side Include (SSI) Injection
#1. Explore
Scenario: Step1.3 Inject SSI
Given prepare to Inject SSI
When Try to Inject SSI
# assertion for attack step success
Then Assert the success of Inject SSI
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
