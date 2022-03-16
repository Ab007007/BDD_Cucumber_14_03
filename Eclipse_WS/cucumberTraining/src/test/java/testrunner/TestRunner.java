package testrunner;

import java.util.Date;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features = "src/test/java/feature/actionsInBDD.feature" ,
				  glue = {"stepdefinition"},
				  //dryRun = true,
				  monochrome = true,
				  plugin = { "pretty" , "junit:target/JunitReports/reports.xml",
						  				"json:target/JsonReports/reports.json",
						  				"html:target/HTMLReports/reports.html"
						  
				  }
		)

public class TestRunner {

}
