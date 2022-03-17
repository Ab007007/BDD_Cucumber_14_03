package testrunner;

import java.util.Date;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features = "src/test/java/feature/" ,
				  glue = {"stepdefinition"},
				 // dryRun = true,
				  monochrome = true,
				  tags = "@parallel",
//				  tags = "@uat",
//				  tags = "@uat and @regression",
//				  tags = "@uat or  @regression",
//				  tags = "@uat and not @regression",
				  plugin = { "pretty" , "junit:target/JunitReports/reports.xml",
						  				"json:target/JsonReports/reports.json",
						  				"html:target/HTMLReports/reports.html"
						  
				  }
		)

public class TestRunner {

}
