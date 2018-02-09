@capec182
Feature: CAPEC-182: Flash Injection
#2. Experiment
Scenario: Step2.1 Determine the application's susceptibility to Flash injection
Given prepare to Determine the application's susceptibility to Flash injection
When Try to Determine the application's susceptibility to Flash injection
# assertion for attack step success
Then Assert the success of Determine the application's susceptibility to Flash injection
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
