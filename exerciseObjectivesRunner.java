package com.Exercise.Testcases;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"progress",
	            "html:report/junit/cucumber-html-report",
	             },
        features = { "src/com/Exercise/Testcases/exerciseObjectives.feature"},
                glue={"src.com.Exercise.Testcases"}

)
public class exerciseObjectivesRunner {
	
}