package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/UdemySignUp.feature",
		glue= {"stepDefination"},
		monochrome=true,		// having proper console output
		dryRun=false,  // It will Check Mapping Between feature file & Step defination
		plugin= {"html:target/cucumber-html-report",
				"json:target/cucumber.json",
				"pretty:target/cucumber-pretty.txt"}
		)
public class UdenyTestRunner {

}
