package com.policyExpert.stepDefinition;

import cucumber.api.java.en.Given;

public class PolicyExpertStepDef {

    @Given("^Do Nothing$")
    public void do_Nothing() throws Throwable {
        System.out.println("---Do Nothing---");
    }
}
