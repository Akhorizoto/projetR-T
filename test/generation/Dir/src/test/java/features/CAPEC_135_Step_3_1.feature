@capec135
Feature: CAPEC-135: Format String Injection
#3. Exploit
Scenario: Step3.1 Try to exploit the Format String Injection vulnerability
Given prepare to Try to exploit the Format String Injection vulnerability
When Try to Try to exploit the Format String Injection vulnerability
# assertion for attack step success
Then Assert the success of Try to exploit the Format String Injection vulnerability
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern 
           #  
Then assert the consequences of the pattern audit interceptor
           # depends secure logger
Then assert the consequences of the pattern secure logger
