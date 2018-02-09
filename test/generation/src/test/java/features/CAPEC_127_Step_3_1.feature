@capec127
Feature: CAPEC-127: Directory Indexing
#3. Exploit
Scenario: Step3.1 Read directories or files which are not intended for public viewing.
Given prepare to Read directories or files which are not intended for public viewing.
When Try to Read directories or files which are not intended for public viewing.
# assertion for attack step success
Then Assert the success of Read directories or files which are not intended for public viewing.
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
           # benifits audit interceptor
Then assert the consequences of the pattern application firewall
           # alternative input guard
Then assert the consequences of the pattern input guard
           # alternative application firewall
Then assert the consequences of the pattern 
           #  
