@capec180
Feature: CAPEC-180: Exploiting Incorrectly Configured Access Control Security Levels
#2. Experiment
Scenario: Step2.1 Identify weak points in access control configurations
Given prepare to Identify weak points in access control configurations
When Try to Identify weak points in access control configurations
# assertion for attack step success
Then Assert the success of Identify weak points in access control configurations
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
