@capec163
Feature: CAPEC-163: Spear Phishing
#2. Experiment
Scenario: Step2.1 Optional: Obtain domain name and certificate to spoof legitimate site
Given prepare to Optional: Obtain domain name and certificate to spoof legitimate site
When Try to Optional: Obtain domain name and certificate to spoof legitimate site
# assertion for attack step success
Then Assert the success of Optional: Obtain domain name and certificate to spoof legitimate site
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
