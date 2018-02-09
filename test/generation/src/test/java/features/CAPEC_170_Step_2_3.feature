@capec170
Feature: CAPEC-170: Web Application Fingerprinting
#2. Experiment
Scenario: Step2.3 Identify Backend Database Version
Given prepare to Identify Backend Database Version
When Try to Identify Backend Database Version
# assertion for attack step success
Then Assert the success of Identify Backend Database Version
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
