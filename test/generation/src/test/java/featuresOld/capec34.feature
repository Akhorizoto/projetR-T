@capec34
Feature: CAPEC-34: HTTP Response Splitting
  #1. Explore
  	Scenario: Step1.1 Spider
  	#Using a browser or an automated tool, an attacker follows all public links on a web site. He records all the links, 
  	#the forms and all potential user-controllable input points for the web application.
    
    #Generic
    Given a new scanning session
    #Generic
    And the application is spidered 
	#Generic
	Then output is validated
    #Context 
    Then input is validated
   
  #2. Experiment
    Scenario: Step2.1 Attempt variations on input parameters
    #The attacker injects the entry points identified in the Explore Phase with response splitting syntax and variations of payloads to be acted on in the additional response. 
    #He records all the responses from the server that include unmodified versions of his payload.
    
    #Generic
    Given prepare to scan crlf-injection weakness
    #Generic
    When the scanner is run
    #Generic
    And the following false positives are removed
      |url                    |parameter          |cweId      |wascId   |
    #Generic
    Then  no Medium or higher risk vulnerabilities should be present
    #Generic
    Then output is validated
    #Context 
    Then input is validated
    
  #3. Exploit
    Scenario: Step3.1 Cross-Site Scripting
    #As the attacker succeeds in exploiting the vulnerability, he can choose to attack the user with Cross-Site Scripting. 
    #The possible outcomes of such an attack are described in the Cross-Site Scripting related attack patterns.
    
    #Generic
    Given prepare to scan cross-site-scripting weakness
    #Generic
    When the scanner is run
    #Generic
    Then no Medium or higher risk vulnerabilities should be present
    #Generic
	Then output is validated
    #Context 
    Then input is validated
    
    
	