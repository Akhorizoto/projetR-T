@capec33
Feature: CAPEC-33: HTTP Request Smuggling
#2. Experiment
Scenario: Step2.1 Probe for vulnerable differences in HTTP parsing chain
Given prepare to Probe for vulnerable differences in HTTP parsing chain
When Try to Probe for vulnerable differences in HTTP parsing chain
# assertion for attack step success
Then Assert the success of Probe for vulnerable differences in HTTP parsing chain
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
           # benifits audit interceptor
