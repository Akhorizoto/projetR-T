@capec7
Feature: CAPEC-7: Blind SQL Injection
#1. Explore
Scenario: Step1.1 Hypothesize SQL queries in application
Given prepare to Hypothesize SQL queries in application
When Try to Hypothesize SQL queries in application
# assertion for attack step success
Then Assert the success of Hypothesize SQL queries in application
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
