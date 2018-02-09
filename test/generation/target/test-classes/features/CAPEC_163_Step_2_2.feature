@capec163
Feature: CAPEC-163: Spear Phishing
#2. Experiment
Scenario: Step2.2 Optional: Explore legitimate website and create duplicate
Given prepare to Optional: Explore legitimate website and create duplicate
When Try to Optional: Explore legitimate website and create duplicate
# assertion for attack step success
Then Assert the success of Optional: Explore legitimate website and create duplicate
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
