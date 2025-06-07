package hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import Driver.Driver_Instance;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import gherkin.ast.Scenario;

public class hook extends Driver_Instance
{
	@Before
	public void before (Scenario s) {
		String name =s.getName();
		System.out.println(name+"scenario started");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@After
	public void after(Scenario s)
	{
		String name =s.getName();
		System.out.println(name+"scenario finished");
		
		driver.quit();
	}
	
	@BeforeStep
	public void beforestep(Scenario s) {
		String name=s.getName();
		System.out.println(name+"Test case Started");
	}
	
	@AfterStep
	public void afterstep(Scenario s)
	{
		String name=s.getName();
		System.out.println(name+"Test case Finished");

	}

}
