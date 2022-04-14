package com.caner.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json=target/cucumber.json",
                  "html=target/default-htm-reports",
                  "rerun=target/rerun.txt"
                 },
        features = "src/test/resources/features",
        glue = "com/caner/step_definitions",
        dryRun = true,
        tags = "@amazon"
        )
public class CukesRunner {
}
