package com.aig.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Features"},
                 glue ={"com.aig.stepDefinition"},
                 plugin ={"com.cucumber.listener.ExtentCucumberFormatter:"},
                 tags = {"@TC_01"},
                 dryRun =false,
                 monochrome = false,
                 strict = true)
public class TestRunner {

}
