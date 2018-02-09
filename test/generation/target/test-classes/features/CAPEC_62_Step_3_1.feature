@capec62
Feature: CAPEC-62: Cross Site Request Forgery (aka Session Riding)
#3. Exploit
Scenario: Step3.1 Convince user to click on link
Given prepare to Convince user to click on link
When Try to Convince user to click on link
# assertion for attack step success
Then Assert the success of Convince user to click on link
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
Then assert the consequences of the pattern 
           #  
