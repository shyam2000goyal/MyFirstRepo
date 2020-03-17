package comdevskillertests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
(
		// glue= {"comdevskillertests"},
		plugin= {"html:target/cucumber-html-report"
				,"json:target/cucumber.json"},
		 features= {"src/test/resources/com/devskiller/tests"},
				tags= {"@ATM"}
)

public class RunCucumberTest {
}