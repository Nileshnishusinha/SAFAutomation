package com.aig.stepDefinition;

import com.aig.cucumber.CustomElementFunctions;
import com.aig.pages.VolPage;
import com.aig.testcases.MyTestDemo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class VOL extends CustomElementFunctions {

     Injection inject;

    public VOL(Injection inject) {
        super(inject);
    }

    @Then("^Validate the expected title as \"([^\"]*)\"$")
    public void validateTheExpectedTitleAs(String arg0) throws Throwable {
        inject.getPage(VolPage.class).validateTheExpectedTitleAs(arg0);
    }

    @Given("^Testing of the Screen Recording feature$")
    public void testingOfTheScreenRecordingFeature() throws Throwable {
        inject.getPage(MyTestDemo.class).navigationTest();
//        inject.getPage(MyTestDemo.class).navigation_FeatureTest();
    }
}
