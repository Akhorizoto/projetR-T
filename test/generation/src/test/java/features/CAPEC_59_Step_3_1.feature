@capec59
Feature: CAPEC-59: Session Credential Falsification through Prediction
#3. Exploit
Scenario: Step3.1 Use matched Session ID
Given prepare to Use matched Session ID
When Try to Use matched Session ID
# assertion for attack step success
Then Assert the success of Use matched Session ID
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
           # benifits audit interceptor
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
