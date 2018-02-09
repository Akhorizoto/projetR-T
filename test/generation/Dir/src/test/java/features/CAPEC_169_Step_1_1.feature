@capec169
Feature: CAPEC-169: Footprinting
#1. Explore
Scenario: Step1.1 Request Footprinting
Given prepare to Request Footprinting
When Try to Request Footprinting
# assertion for attack step success
Then Assert the success of Request Footprinting
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
