package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/Features/Login.feature",
"src/test/resources/Features/MArray.feature","src/test/resources/Features/NLinkedList.feature"},
glue= {"StepDefinitions"},
monochrome=true,
plugin={"pretty","html:target/HtmlReports/report.html"})
public class TestRunner {
	
	

}
