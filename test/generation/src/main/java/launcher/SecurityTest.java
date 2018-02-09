package launcher;



import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/"},
        format = {"pretty", "html:build/reports/cucumber/html", "json:build/reports/cucumber/all_tests.json", "junit:build/reports/junit/all_tests.xml"},
        glue = {"steps"}/*,
       tags = {"~@skip"}*/
)
public class SecurityTest {

    @AfterClass
    public static void tearDown() {
        
    }
}
