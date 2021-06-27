package com.fruitionconsult.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/java/features"},
        glue = {"com/fruitionconsult/hooks", "com/fruitionconsult/stepDefinitions"},
        publish = true
)
public class Runner {
}
