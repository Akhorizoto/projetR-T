@capec215
Feature: CAPEC-215: Fuzzing and observing application log data/errors for application mapping
#2. Experiment
Scenario: Step2.1 Modify the parameters to get the desired information from the error messages.
Given prepare to Modify the parameters to get the desired information from the error messages.
When Try to Modify the parameters to get the desired information from the error messages.
# assertion for attack step success
Then Assert the success of Modify the parameters to get the desired information from the error messages.
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern secure logger
