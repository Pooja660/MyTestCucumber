package com.vtiger.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/com/vtiger/Features/login.feature"
		,glue= {"com.vtiger.StepDefinitions"},
				 plugin = { "pretty", "json:target/cucumber.json" },
				 tags = {"@Smoke"},////or
				 //tags = {"@Smoke","~@Sanity"},////And
				 monochrome = true)
public class TestRunner {

}
