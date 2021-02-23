package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"FeatureFiles"},glue={"stepDefination"},monochrome=true,
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/Login.html","pretty", "html:target/cucumber-reports"})
public class Runner1 {

}