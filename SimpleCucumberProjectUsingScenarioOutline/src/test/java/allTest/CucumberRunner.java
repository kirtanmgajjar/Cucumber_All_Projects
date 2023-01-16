package allTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"src/test/resources/features/BasicContactForm.feature"},
				glue = {"allTest"}, plugin = {"pretty","html:reports/cucumber-report.html"}, dryRun = false)
public class CucumberRunner extends AbstractTestNGCucumberTests
{

}
