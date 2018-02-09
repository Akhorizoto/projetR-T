@capec31
Feature: CAPEC-31: Accessing/Intercepting/Modifying HTTP Cookies
#1. Explore
Scenario: Step1.1 Obtain copy of cookie
Given prepare to Obtain copy of cookie
When Try to Obtain copy of cookie
# assertion for attack step success
Then Assert the success of Obtain copy of cookie
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
