package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src//test//resources//features//",

		glue="stepdefs",
		monochrome=true,
		//dryRun=true
		dryRun=false
		 
				
)
public class ECommRunner extends AbstractTestNGCucumberTests {
	
	
}
