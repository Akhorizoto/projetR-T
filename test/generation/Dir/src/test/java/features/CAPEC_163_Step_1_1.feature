@capec163
Feature: CAPEC-163: Spear Phishing
#1. Explore
Scenario: Step1.1 Obtain useful contextual detailed information about the targeted user or organization
Given prepare to Obtain useful contextual detailed information about the targeted user or organization
When Try to Obtain useful contextual detailed information about the targeted user or organization
# assertion for attack step success
Then Assert the success of Obtain useful contextual detailed information about the targeted user or organization
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
