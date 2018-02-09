@capec135
Feature: CAPEC-135: Format String Injection
#2. Experiment
Scenario: Step2.1 Determine user-controllable input susceptible to format string injection
Given prepare to Determine user-controllable input susceptible to format string injection
When Try to Determine user-controllable input susceptible to format string injection
# assertion for attack step success
Then Assert the success of Determine user-controllable input susceptible to format string injection
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
Then assert the consequences of the pattern application firewall
           # alternative output guard
           # alternative input guard
Then assert the consequences of the pattern input guard
           # alternative application firewall
           # benifits output guard
Then assert the consequences of the pattern pathname canonicalization
Then assert the consequences of the pattern output guard
           # alternative application firewall
           # benifits input guard
Then assert the consequences of the pattern comparator checked fault tolerant system
           # alternative output guard
