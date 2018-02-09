@capec275
Feature: CAPEC-275: DNS Rebinding
#3. Exploit
Scenario: Step3.1 Access & exfiltrate data within the victim's security zone
Given prepare to Access & exfiltrate data within the victim's security zone
When Try to Access & exfiltrate data within the victim's security zone
# assertion for attack step success
Then Assert the success of Access & exfiltrate data within the victim's security zone
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern output guard
Then assert the consequences of the pattern comparator checked fault tolerant system
           # alternative output guard
Then assert the consequences of the pattern 
           #  
