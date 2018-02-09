@capec260
Feature: CAPEC-260: Passively Sniffing and Capturing Application Code Bound for an Authorized Client During Initial Distribution
#1. Explore
Scenario: Step1.1 Set up a sniffer
Given prepare to Set up a sniffer
When Try to Set up a sniffer
# assertion for attack step success
Then Assert the success of Set up a sniffer
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
