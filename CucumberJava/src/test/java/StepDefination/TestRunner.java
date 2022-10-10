package StepDefination;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefination"},
plugin={"pretty","junit:target/JunitReports/report1.xml"})
public class TestRunner 
{
	
}
