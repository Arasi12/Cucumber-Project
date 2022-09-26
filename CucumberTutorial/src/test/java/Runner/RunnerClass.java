package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featureFiles" ,
glue="stepDefinition",
dryRun =  true,
monochrome = true,
plugin= {"html:report/WebReport.html",
		"json:report/jsonreport.json",
		"junit:report/cucumber.xml"}
,
tags = "@SimpleLogin and @DataDriven"

)
public class RunnerClass {

	
	
}
