@capec1
Feature: CAPEC-1: Accessing Functionality Not Properly Constrained by ACLs
#1. Explore
Scenario: Step1.2 Identify Functionality
Given prepare to Identify Functionality
When Try to Identify Functionality
# assertion for attack step success
Then Assert the success of Identify Functionality
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
