package runner;

import org.testing.automation.Test;

import cucumber.api.CucumberOptions;

// uncomment @RunWith if you are using JUnit to run test
// @RunWith(Cucucmber.class)

@CucumberOptions(features= {"src//test//java//features"}
				 , glue= {"stepdefinitions", "utility"}
				 , plugin= {"pretty", "html:target/cucumber"}
				 , tags= {"@web"}
				 )

@Test
public class RunTest extends AbstractTestNGCucumberTests{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
