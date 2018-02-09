@capec11
Feature: CAPEC-11: Cause Web Server Misclassification
#2. Experiment
Scenario: Step2.2 File misclassification sniping
Given prepare to File misclassification sniping
When Try to File misclassification sniping
# assertion for attack step success
Then Assert the success of File misclassification sniping
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
           # benifits audit interceptor
Then assert the consequences of the pattern application firewall
           # alternative input guard
Then assert the consequences of the pattern input guard
           # alternative application firewall
Then assert the consequences of the pattern pathname canonicalization
