@capec61
Feature: CAPEC-61: Session Fixation
#3. Exploit
Scenario: Step3.1 Abuse the Victim's Session
Given prepare to Abuse the Victim's Session
When Try to Abuse the Victim's Session
# assertion for attack step success
Then Assert the success of Abuse the Victim's Session
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
           # benifits audit interceptor
