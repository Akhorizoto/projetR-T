@capec66
Feature: CAPEC-66: SQL Injection
  
  #1. Explore
  	Scenario: Step1.1 Survey application
  	#The attacker first takes an inventory of the functionality exposed by the application.
    #Generic 
#    Given a new scanning session
    #Generic
    And the application is spidered 
    #assertions for security pattern testing (checker whether the pattern consequences are observed)
   	#Context
    Then output is validated
    #assertions for security pattern testing (checker whether the pattern consequences are observed)
   	#Context 
    Then input is validated
    
    
    
  #2. Experiment
    Scenario: Step2.1 Determine user-controllable input susceptible to injection
    #Determine the user-controllable input susceptible to injection. For each user-controllable input that the attacker 
    #suspects is vulnerable to SQL injection, attempt to inject characters that have special meaning in SQL 
    #(such as a single quote character, a double quote character, two hyphens, a parenthesis, etc.). 
    #The goal is to create a SQL query with an invalid syntax.
    
    #Generic
    Given prepare to scan sql-injection weakness
    #Generic
    When the scanner is run
    #Generic
    And the following false positives are removed
      |url                    |parameter          |cweId      |wascId   |
    #Generic
    Then  no Medium or higher risk vulnerabilities should be present
   	#assertions for security pattern testing (checker whether the pattern consequences are observed)
   	#Context
    Then output is validated
    #assertions for security pattern testing (checker whether the pattern consequences are observed)
   	#Context 
    Then input is validated
    
  	Scenario: Step2.2 Experiment and try to exploit SQL Injection vulnerability
	#After determining that a given input is vulnerable to SQL Injection, 
	#hypothesize what the underlying query looks like. Iteratively try to add logic to 
	#the query to extract information from the database, 
	#or to modify or delete information in the database.
	
	#Generic
	Given a new browser or client instance
    #Generic
    And   the login page
    #Context 
    When  force login with 'or'1'='1 
    #Generic 
    Then  the user is logged in
    
    
	