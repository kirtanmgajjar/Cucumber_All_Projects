package allTest;

import baseClass.BaseClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"src/test/resources/features/SignUp.feature"},
				glue = {"allTest"}, plugin = {"pretty","html:reports/cucumber-report.html"})
public class CucumberRunner extends BaseClass
{

}
