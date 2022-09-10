package testRunnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"C:\\Users\\Ina Gous\\eclipse-workspace\\ArtsWebdriver\\src\\main\\resources\\Features\\Google.feature"},
		glue = {"Stepdefinationsfile"},
		dryRun = false,
		monochrome = true		
		
		
		
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
