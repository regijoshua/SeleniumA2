package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features = {"D:\\Java Eclipse\\Cucumber\\src\\test\\java\\Feature\\Login.feature"},
		glue={"Steps","Hook"},
		dryRun=true,
		snippets=SnippetType.CAMELCASE,
		monochrome = true,
		plugin= {"pretty","html:Results","json:Results/result.json","junit:Results/result.xml"}
		//tags = {"@smoke","@reg"}
		)
public class TestRunner extends AbstractTestNGCucumberTests{
	


}
