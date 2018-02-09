@capec127
Feature: CAPEC-127: Directory Indexing
#2. Experiment
Scenario: Step2.1 Iteratively explore directory/file structures
Given prepare to Iteratively explore directory/file structures
When Try to Iteratively explore directory/file structures
# assertion for attack step success
Then Assert the success of Iteratively explore directory/file structures
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
