@capec43
Feature: CAPEC-43: Exploiting Multiple Input Interpretation Layers
#2. Experiment
Scenario: Step2.1 Determine which character encodings are accepted by the application/system
Given prepare to Determine which character encodings are accepted by the application/system
When Try to Determine which character encodings are accepted by the application/system
# assertion for attack step success
Then Assert the success of Determine which character encodings are accepted by the application/system
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
           # benifits audit interceptor
