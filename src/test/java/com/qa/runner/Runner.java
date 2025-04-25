package com.qa.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/qa/stepdefinitions",
        dryRun = false,
        tags = "@regression",

//        plugin = {"pretty", "html:target/uiReport.html", "rerun:target/uiFailedTests.txt",
//                "json:target/cucumber-reports/cucumber.json"})
        plugin={"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)
public class Runner {

}
