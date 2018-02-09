@capec33
Feature: CAPEC-33: HTTP Request Smuggling
#3. Exploit
Scenario: Step3.1 Cache poisoning
Given prepare to Cache poisoning
When Try to Cache poisoning
# assertion for attack step success
Then Assert the success of Cache poisoning
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
           # benifits audit interceptor
