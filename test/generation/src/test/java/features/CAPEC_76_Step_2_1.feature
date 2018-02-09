@capec76
Feature: CAPEC-76: Manipulating Input to File System Calls
#2. Experiment
Scenario: Step2.1 Vary inputs, looking for malicious results
Given prepare to Vary inputs, looking for malicious results
When Try to Vary inputs, looking for malicious results
# assertion for attack step success
Then Assert the success of Vary inputs, looking for malicious results
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
