package com.selenium;

import cucumber.api.CucumberOptions;

//@CucumberOptions(features="/src/main/resources/main.feature"
//				 , glue="com.selenium")


/*@CucumberOptions(features="/src/main/resources/main1.feature"
				 , glue="com.fusion.modules.testing"
				 , plugin="html:target/test-report")
				 */

@CucumberOptions(features="/src/main/resources/main2.feature"
, glue="com.fusion.modules.testing"
, plugin="html:target/test-report")

public class TestRunner {
	
}
