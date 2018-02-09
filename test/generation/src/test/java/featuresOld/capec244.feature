@capec244
Feature: CAPEC-244: Cross-Site Scripting via Encoded URI Schemes
  
  #1. Explore
  	Scenario: Step1.1 Survey the application
  	#Using a browser or an automated tool, an attacker follows all public links on a web site. He records all the links he finds.
    
    #Generic 
#   Given a new scanning session
    #Generic 
    And the application is spidered 
    #assertions for security pattern testing (checker whether the pattern consequences are observed)
   	#Context
    Then output is validated
    #assertions for security pattern testing (checker whether the pattern consequences are observed)
   	#Context 
    Then input is validated
   
  #2. Experiment
    Scenario: Step2.1 Attempt injection payload variations on input parameters
    #possibly using an automated tool, an attacker requests variations on the inputs he surveyed before. He sends parameters that include variations of payloads. 
    #He records all the responses from the server that include unmodified versions of his script.
    
    #Generic 
    Given prepare to scan cross-site-scripting weakness
    #Generic 
    When the scanner is run
    #Generic
    And the following false positives are removed
      |url                    |parameter          |cweId      |wascId   |
    #Generic 
    Then no Medium or higher risk vulnerabilities should be present
    #assertions for security pattern testing (checker whether the pattern consequences are observed)
   	#Context
    Then output is validated
    #assertions for security pattern testing (checker whether the pattern consequences are observed)
   	#Context 
    Then input is validated
     
  #3. Exploit
       
    Scenario: Step3.2 Forceful browsing
	#the attacker targets the current application or another one 
	#(through CSRF vulnerabilities), the user will then be the one who perform the 
	#attacks without being aware of it. These attacks are mostly targeting application 
	#logic flaws, but it can also be used to create a widespread attack against a 
	#particular website on the user's current network (Internet or not).
	
	#Generic 
	Given a new browser or client instance
	#Context 
	And  vulnerable page with executed script
	#Context 
	When navigate to inserted link
	#Context 
	Then the link is changed
    
	