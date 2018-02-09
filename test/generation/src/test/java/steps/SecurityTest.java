
package steps;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/generic/CAPEC_102_Step_2_1.feature"},
        format = {"pretty", "html:build/reports/cucumber/html", "json:build/reports/cucumber/all_tests.json", "junit:build/reports/junit/all_tests.xml"},
        glue = {"generic"}/*,
       tags = {"~@skip"}*/
)
public class SecurityTest {

    @AfterClass
    public static void tearDown() {
        
    }
}
