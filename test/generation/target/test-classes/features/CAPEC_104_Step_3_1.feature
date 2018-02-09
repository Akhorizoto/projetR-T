@capec104
Feature: CAPEC-104: Cross Zone Scripting
#3. Exploit
Scenario: Step3.1 Craft and inject the payload
Given prepare to Craft and inject the payload
When Try to Craft and inject the payload
# assertion for attack step success
Then Assert the success of Craft and inject the payload
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
