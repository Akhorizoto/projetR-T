@capec34
Feature: CAPEC-34: HTTP Response Splitting
#2. Experiment
Scenario: Step2.1 Attempt variations on input parameters
Given prepare to Attempt variations on input parameters
When Try to Attempt variations on input parameters
# assertion for attack step success
Then Assert the success of Attempt variations on input parameters
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
           # benifits audit interceptor
Then assert the consequences of the pattern application firewall
           # alternative input guard
Then assert the consequences of the pattern input guard
           # alternative application firewall
