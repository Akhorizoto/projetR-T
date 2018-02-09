@capec62
Feature: CAPEC-62: Cross Site Request Forgery (aka Session Riding)
#2. Experiment
Scenario: Step2.1 Create a link that when clicked on, will execute the interesting functionality.
Given prepare to Create a link that when clicked on, will execute the interesting functionality.
When Try to Create a link that when clicked on, will execute the interesting functionality.
# assertion for attack step success
Then Assert the success of Create a link that when clicked on, will execute the interesting functionality.
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
Then assert the consequences of the pattern 
           #  
