package com.instinet;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:featurefiles", plugin = {"pretty", "html:target/Test-reports"}, glue = {"com/instinet/stepdefinitions"},tags = "Runthistest")
public class RunTest {
}
