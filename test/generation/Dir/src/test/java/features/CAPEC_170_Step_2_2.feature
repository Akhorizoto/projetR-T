@capec170
Feature: CAPEC-170: Web Application Fingerprinting
#2. Experiment
Scenario: Step2.2 Identify Web Application Software
Given prepare to Identify Web Application Software
When Try to Identify Web Application Software
# assertion for attack step success
Then Assert the success of Identify Web Application Software
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern secure logger
