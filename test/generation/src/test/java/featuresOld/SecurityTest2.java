
package featuresOld;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/CAPEC_244_Step_1_1.feature"},
        format = {"pretty", "html:build/reports/cucumber/html", "json:build/reports/cucumber/all_tests.json", "junit:build/reports/junit/all_tests.xml"},
        glue = {"net.continuumsecurity.steps"}/*,
       tags = {"~@skip"}*/
)
public class SecurityTest2 {

    @AfterClass
    public static void tearDown() {
        
    }
}
