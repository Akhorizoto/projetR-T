@capec98
Feature: CAPEC-98: Phishing
#1. Explore
Scenario: Step1.2 Explore legitimate website and create duplicate
Given prepare to Explore legitimate website and create duplicate
When Try to Explore legitimate website and create duplicate
# assertion for attack step success
Then Assert the success of Explore legitimate website and create duplicate
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
