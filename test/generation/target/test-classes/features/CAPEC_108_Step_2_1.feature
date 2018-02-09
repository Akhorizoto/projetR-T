@capec108
Feature: CAPEC-108: Command Line Execution through SQL Injection
#2. Exploit
Scenario: Step2.1 Achieve arbitrary command execution through SQL Injection with the MSSQL_xp_cmdshell directive
Given prepare to Achieve arbitrary command execution through SQL Injection with the MSSQL_xp_cmdshell directive
When Try to Achieve arbitrary command execution through SQL Injection with the MSSQL_xp_cmdshell directive
# assertion for attack step success
Then Assert the success of Achieve arbitrary command execution through SQL Injection with the MSSQL_xp_cmdshell directive
#assertions for security pattern testing (checker whether the pattern consequences are observed)
Then assert the consequences of the pattern secure logger
Then assert the consequences of the pattern application firewall
           # alternative input guard
Then assert the consequences of the pattern input guard
           # alternative application firewall
