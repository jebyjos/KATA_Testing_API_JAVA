package com.kss;


import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
        "src/test/java/com/kss"
}, glue = "step_definitions")
public class RunnerClass {
    public RunnerClass(){

    }
}
