package com.policyExpert.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    glue = {"com.policyExpert.stepDefinition"},
    features = "src/test/resources/features/",
    plugin = {
        "pretty",
        "html:test-output",
    }
)
class TestRunner {
}