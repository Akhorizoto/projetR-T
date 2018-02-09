$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("capec244.feature");
formatter.feature({
  "line": 2,
  "name": "CAPEC-244: Cross-Site Scripting via Encoded URI Schemes",
  "description": "",
  "id": "capec-244:-cross-site-scripting-via-encoded-uri-schemes",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@capec244"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#1. Explore"
    }
  ],
  "line": 5,
  "name": "Step1.1 Survey the application",
  "description": "",
  "id": "capec-244:-cross-site-scripting-via-encoded-uri-schemes;step1.1-survey-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#Using a browser or an automated tool, an attacker follows all public links on a web site. He records all the links he finds."
    },
    {
      "line": 8,
      "value": "#Generic"
    }
  ],
  "line": 9,
  "name": "a new scanning session",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 10,
      "value": "#Generic"
    }
  ],
  "line": 11,
  "name": "the application is spidered",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "#assertions for security pattern testing (checker whether the pattern consequences are observed)"
    },
    {
      "line": 13,
      "value": "#Generic"
    }
  ],
  "line": 14,
  "name": "output is validated",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 15,
      "value": "#assertions for security pattern testing (checker whether the pattern consequences are observed)"
    },
    {
      "line": 16,
      "value": "#Context"
    }
  ],
  "line": 17,
  "name": "input is validated",
  "keyword": "Then "
});
formatter.match({
  "location": "AppScanningSteps.createNewScanSession()"
});
formatter.result({
  "duration": 10318393733,
  "status": "passed"
});
formatter.match({
  "location": "AppScanningSteps.theApplicationIsSpidered()"
});
formatter.result({
  "duration": 90904818577,
  "status": "passed"
});
formatter.match({
  "location": "AppScanningSteps.outputValide()"
});
formatter.result({
  "duration": 102204117,
  "error_message": "java.lang.AssertionError: \nExpected: is \u003ctrue\u003e\n     but: was \u003cfalse\u003e\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:8)\n\tat net.continuumsecurity.steps.AppScanningSteps.outputValide(AppScanningSteps.java:296)\n\tat ✽.Then output is validated(capec244.feature:14)\n",
  "status": "failed"
});
formatter.match({
  "location": "WebApplicationSteps.statusCode2xx()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 19,
      "value": "#2. Experiment"
    }
  ],
  "line": 20,
  "name": "Step2.1 Attempt injection payload variations on input parameters",
  "description": "",
  "id": "capec-244:-cross-site-scripting-via-encoded-uri-schemes;step2.1-attempt-injection-payload-variations-on-input-parameters",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 21,
      "value": "#possibly using an automated tool, an attacker requests variations on the inputs he surveyed before. He sends parameters that include variations of payloads."
    },
    {
      "line": 22,
      "value": "#He records all the responses from the server that include unmodified versions of his script."
    },
    {
      "line": 24,
      "value": "#Generic"
    }
  ],
  "line": 25,
  "name": "prepare to scan cross-site-scripting weakness",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 26,
      "value": "#Generic"
    }
  ],
  "line": 27,
  "name": "the scanner is run",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 28,
      "value": "#Generic"
    }
  ],
  "line": 29,
  "name": "the following false positives are removed",
  "rows": [
    {
      "cells": [
        "url",
        "parameter",
        "cweId",
        "wascId"
      ],
      "line": 30
    }
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 31,
      "value": "#Generic"
    }
  ],
  "line": 32,
  "name": "no Medium or higher risk vulnerabilities should be present",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 33,
      "value": "#assertions for security pattern testing (checker whether the pattern consequences are observed)"
    },
    {
      "line": 34,
      "value": "#Generic"
    }
  ],
  "line": 35,
  "name": "output is validated",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 36,
      "value": "#assertions for security pattern testing (checker whether the pattern consequences are observed)"
    },
    {
      "line": 37,
      "value": "#Context"
    }
  ],
  "line": 38,
  "name": "input is validated",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "cross-site-scripting",
      "offset": 16
    }
  ],
  "location": "AppScanningSteps.enablePolicyy(String)"
});
formatter.result({
  "duration": 2763879302,
  "error_message": "net.continuumsecurity.proxy.ProxyException: Error occurred for setScannerAttackStrength\n\tat net.continuumsecurity.proxy.ZAProxyScanner.setScannerAttackStrength(ZAProxyScanner.java:106)\n\tat net.continuumsecurity.steps.AppScanningSteps.setAttackStrength(AppScanningSteps.java:305)\n\tat net.continuumsecurity.steps.AppScanningSteps.enablePolicyy(AppScanningSteps.java:211)\n\tat ✽.Given prepare to scan cross-site-scripting weakness(capec244.feature:25)\nCaused by: org.zaproxy.clientapi.core.ClientApiException: N\u0027\u0027existe pas\n\tat org.zaproxy.clientapi.core.ApiResponseFactory.getResponse(ApiResponseFactory.java:32)\n\tat org.zaproxy.clientapi.core.ClientApi.callApi(ClientApi.java:290)\n\tat org.zaproxy.clientapi.gen.Ascan.setScannerAttackStrength(Ascan.java:464)\n\tat net.continuumsecurity.proxy.ZAProxyScanner.setScannerAttackStrength(ZAProxyScanner.java:103)\n\tat net.continuumsecurity.steps.AppScanningSteps.setAttackStrength(AppScanningSteps.java:305)\n\tat net.continuumsecurity.steps.AppScanningSteps.enablePolicyy(AppScanningSteps.java:211)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:678)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\n",
  "status": "failed"
});
formatter.match({
  "location": "AppScanningSteps.runScanner()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppScanningSteps.removeFalsePositives(ZAPFalsePositive\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Medium",
      "offset": 3
    }
  ],
  "location": "AppScanningSteps.checkVulnerabilities(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppScanningSteps.outputValide()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WebApplicationSteps.statusCode2xx()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 40,
      "value": "#3. Exploit"
    }
  ],
  "line": 42,
  "name": "Step3.2 Forceful browsing",
  "description": "",
  "id": "capec-244:-cross-site-scripting-via-encoded-uri-schemes;step3.2-forceful-browsing",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 43,
      "value": "#the attacker targets the current application or another one"
    },
    {
      "line": 44,
      "value": "#(through CSRF vulnerabilities), the user will then be the one who perform the"
    },
    {
      "line": 45,
      "value": "#attacks without being aware of it. These attacks are mostly targeting application"
    },
    {
      "line": 46,
      "value": "#logic flaws, but it can also be used to create a widespread attack against a"
    },
    {
      "line": 47,
      "value": "#particular website on the user\u0027s current network (Internet or not)."
    },
    {
      "line": 49,
      "value": "#Generic"
    }
  ],
  "line": 50,
  "name": "a new browser or client instance",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 51,
      "value": "#Context"
    }
  ],
  "line": 52,
  "name": "vulnerable page with executed script",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 53,
      "value": "#Context"
    }
  ],
  "line": 54,
  "name": "navigate to inserted link",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 55,
      "value": "#Context"
    }
  ],
  "line": 56,
  "name": "the link is changed",
  "keyword": "Then "
});
formatter.match({
  "location": "WebApplicationSteps.createAppForAnyClient()"
});
formatter.result({
  "duration": 107897017,
  "status": "passed"
});
formatter.match({
  "location": "WebApplicationSteps.xssedpage()"
});
formatter.result({
  "duration": 17408,
  "status": "passed"
});
formatter.match({
  "location": "WebApplicationSteps.navigatetoInsertedLink()"
});
formatter.result({
  "duration": 9321,
  "status": "passed"
});
formatter.match({
  "location": "WebApplicationSteps.changedLink()"
});
formatter.result({
  "duration": 13985,
  "status": "passed"
});
formatter.uri("capec66.feature");
formatter.feature({
  "line": 2,
  "name": "CAPEC-66: SQL Injection",
  "description": "",
  "id": "capec-66:-sql-injection",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@capec66"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#1. Explore"
    }
  ],
  "line": 5,
  "name": "Step1.1 Survey application",
  "description": "",
  "id": "capec-66:-sql-injection;step1.1-survey-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#The attacker first takes an inventory of the functionality exposed by the application."
    },
    {
      "line": 7,
      "value": "#Generic"
    }
  ],
  "line": 8,
  "name": "a new scanning session",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#Generic"
    }
  ],
  "line": 10,
  "name": "the application is spidered",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "#assertions for security pattern testing (checker whether the pattern consequences are observed)"
    },
    {
      "line": 12,
      "value": "#Generic"
    }
  ],
  "line": 13,
  "name": "output is validated",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 14,
      "value": "#assertions for security pattern testing (checker whether the pattern consequences are observed)"
    },
    {
      "line": 15,
      "value": "#Context"
    }
  ],
  "line": 16,
  "name": "input is validated",
  "keyword": "Then "
});
formatter.match({
  "location": "AppScanningSteps.createNewScanSession()"
});
formatter.result({
  "duration": 2375602885,
  "status": "passed"
});
formatter.match({
  "location": "AppScanningSteps.theApplicationIsSpidered()"
});
formatter.result({
  "duration": 19809,
  "status": "passed"
});
formatter.match({
  "location": "AppScanningSteps.outputValide()"
});
formatter.result({
  "duration": 73274843,
  "error_message": "java.lang.AssertionError: \nExpected: is \u003ctrue\u003e\n     but: was \u003cfalse\u003e\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:8)\n\tat net.continuumsecurity.steps.AppScanningSteps.outputValide(AppScanningSteps.java:296)\n\tat ✽.Then output is validated(capec66.feature:13)\n",
  "status": "failed"
});
formatter.match({
  "location": "WebApplicationSteps.statusCode2xx()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 20,
      "value": "#2. Experiment"
    }
  ],
  "line": 21,
  "name": "Step2.1 Determine user-controllable input susceptible to injection",
  "description": "",
  "id": "capec-66:-sql-injection;step2.1-determine-user-controllable-input-susceptible-to-injection",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 22,
      "value": "#Determine the user-controllable input susceptible to injection. For each user-controllable input that the attacker"
    },
    {
      "line": 23,
      "value": "#suspects is vulnerable to SQL injection, attempt to inject characters that have special meaning in SQL"
    },
    {
      "line": 24,
      "value": "#(such as a single quote character, a double quote character, two hyphens, a parenthesis, etc.)."
    },
    {
      "line": 25,
      "value": "#The goal is to create a SQL query with an invalid syntax."
    },
    {
      "line": 27,
      "value": "#Generic"
    }
  ],
  "line": 28,
  "name": "prepare to scan sql-injection weakness",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 29,
      "value": "#Generic"
    }
  ],
  "line": 30,
  "name": "the scanner is run",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 31,
      "value": "#Generic"
    }
  ],
  "line": 32,
  "name": "the following false positives are removed",
  "rows": [
    {
      "cells": [
        "url",
        "parameter",
        "cweId",
        "wascId"
      ],
      "line": 33
    }
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 34,
      "value": "#Generic"
    }
  ],
  "line": 35,
  "name": "no Medium or higher risk vulnerabilities should be present",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 36,
      "value": "#assertions for security pattern testing (checker whether the pattern consequences are observed)"
    },
    {
      "line": 37,
      "value": "#Generic"
    }
  ],
  "line": 38,
  "name": "output is validated",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 39,
      "value": "#assertions for security pattern testing (checker whether the pattern consequences are observed)"
    },
    {
      "line": 40,
      "value": "#Context"
    }
  ],
  "line": 41,
  "name": "input is validated",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "sql-injection",
      "offset": 16
    }
  ],
  "location": "AppScanningSteps.enablePolicyy(String)"
});
formatter.result({
  "duration": 3189740832,
  "error_message": "net.continuumsecurity.proxy.ProxyException: Error occurred for setScannerAttackStrength\n\tat net.continuumsecurity.proxy.ZAProxyScanner.setScannerAttackStrength(ZAProxyScanner.java:106)\n\tat net.continuumsecurity.steps.AppScanningSteps.setAttackStrength(AppScanningSteps.java:305)\n\tat net.continuumsecurity.steps.AppScanningSteps.enablePolicyy(AppScanningSteps.java:211)\n\tat ✽.Given prepare to scan sql-injection weakness(capec66.feature:28)\nCaused by: org.zaproxy.clientapi.core.ClientApiException: N\u0027\u0027existe pas\n\tat org.zaproxy.clientapi.core.ApiResponseFactory.getResponse(ApiResponseFactory.java:32)\n\tat org.zaproxy.clientapi.core.ClientApi.callApi(ClientApi.java:290)\n\tat org.zaproxy.clientapi.gen.Ascan.setScannerAttackStrength(Ascan.java:464)\n\tat net.continuumsecurity.proxy.ZAProxyScanner.setScannerAttackStrength(ZAProxyScanner.java:103)\n\tat net.continuumsecurity.steps.AppScanningSteps.setAttackStrength(AppScanningSteps.java:305)\n\tat net.continuumsecurity.steps.AppScanningSteps.enablePolicyy(AppScanningSteps.java:211)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:678)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\n",
  "status": "failed"
});
formatter.match({
  "location": "AppScanningSteps.runScanner()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppScanningSteps.removeFalsePositives(ZAPFalsePositive\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Medium",
      "offset": 3
    }
  ],
  "location": "AppScanningSteps.checkVulnerabilities(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppScanningSteps.outputValide()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WebApplicationSteps.statusCode2xx()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 43,
  "name": "Step2.2 Experiment and try to exploit SQL Injection vulnerability",
  "description": "",
  "id": "capec-66:-sql-injection;step2.2-experiment-and-try-to-exploit-sql-injection-vulnerability",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 44,
      "value": "#After determining that a given input is vulnerable to SQL Injection,"
    },
    {
      "line": 45,
      "value": "#hypothesize what the underlying query looks like. Iteratively try to add logic to"
    },
    {
      "line": 46,
      "value": "#the query to extract information from the database,"
    },
    {
      "line": 47,
      "value": "#or to modify or delete information in the database."
    },
    {
      "line": 49,
      "value": "#Generic"
    }
  ],
  "line": 50,
  "name": "a new browser or client instance",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 51,
      "value": "#Generic"
    }
  ],
  "line": 52,
  "name": "the login page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 53,
      "value": "#Context"
    }
  ],
  "line": 54,
  "name": "force login with \u0027or\u00271\u0027\u003d\u00271",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 55,
      "value": "#Generic"
    }
  ],
  "line": 56,
  "name": "the user is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "WebApplicationSteps.createAppForAnyClient()"
});
formatter.result({
  "duration": 81639895,
  "status": "passed"
});
formatter.match({
  "location": "WebApplicationSteps.openLoginPageFromGiven()"
});
formatter.result({
  "duration": 131432334,
  "status": "passed"
});
formatter.match({
  "location": "WebApplicationSteps.forcelogin()"
});
formatter.result({
  "duration": 664141586,
  "status": "passed"
});
formatter.match({
  "location": "WebApplicationSteps.loginSucceeds()"
});
formatter.result({
  "duration": 68120504,
  "error_message": "java.lang.AssertionError: The user is logged in\nExpected: is \u003cfalse\u003e\n     but: was \u003ctrue\u003e\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)\n\tat net.continuumsecurity.steps.WebApplicationSteps.loginSucceeds(WebApplicationSteps.java:234)\n\tat ✽.Then the user is logged in(capec66.feature:56)\n",
  "status": "failed"
});
});