package com.aig.stepDefinition;

import com.aig.cucumber.CustomElementFunctions;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hooks extends CustomElementFunctions {
    private Injection inject;

    public Hooks(Injection inject) {
        super(inject);
        this.inject = inject;
    }

    String URL = getProp("URL", inject.globalParameterFile);

    @Given("^Start browser as \"([^\"]*)\" and open the application$")
    public void startBrowserAsAndOpenTheApplication(String arg0) throws Throwable {
        invokeApp(arg0);
        navigateTo(URL, 10);
    }
}
