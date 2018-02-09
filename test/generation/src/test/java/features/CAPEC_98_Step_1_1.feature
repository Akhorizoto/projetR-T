@capec98
Feature: CAPEC-98: Phishing
#1. Explore
Scenario: Step1.1 Obtain domain name and certificate to spoof legitimate site
Given prepare to Obtain domain name and certificate to spoof legitimate site
When Try to Obtain domain name and certificate to spoof legitimate site
# assertion for attack step success
Then Assert the success of Obtain domain name and certificate to spoof legitimate site
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
