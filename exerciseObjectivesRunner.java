package com.Exercise.Testcases;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"progress",
	            "html:build/report/html",
	            "junit:build/report/junit/cucumber-report.xml",
	            "json:build/report/json/cucumber-report.json"
	    },
        features = { "src/com/Exercise/Testcases/exerciseObjectives.feature"},
                glue={"src.com.Exercise.Testcases"}

)
public class exerciseObjectivesRunner {
	
}