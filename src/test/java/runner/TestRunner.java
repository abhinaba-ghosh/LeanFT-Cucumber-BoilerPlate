package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features",
        glue = {"steps"},
        plugin = {"json:TestResults/cucumber-report.json",
                    "junit:TestResults/cucumber-junit.xml",
                    "html:TestResults/cucumber-pretty"})
public class TestRunner{

}