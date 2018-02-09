@capec33
Feature: CAPEC-33: HTTP Request Smuggling
#3. Exploit
Scenario: Step3.2 Session Hijacking
Given prepare to Session Hijacking
When Try to Session Hijacking
# assertion for attack step success
Then Assert the success of Session Hijacking
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
           # benifits audit interceptor
