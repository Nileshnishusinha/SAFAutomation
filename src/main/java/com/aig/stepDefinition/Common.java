package com.aig.stepDefinition;

import com.aig.cucumber.CustomElementFunctions;
import com.aig.pages.VolPage;
import com.aig.utility.MyScreenRecorder;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class Common extends CustomElementFunctions {


    //-----------------------------------objects start-----------------------------------------------------
    String globalEmail =System.getProperty("email");
    String globalMobile =System.getProperty("phone");
    String globalParameters = "\\src\\test\\resources\\RunConfig.properties";

    //-----------------------------------objects end -----------------------------------------------------


   Injection inject;
    public Common(Injection inject) {
        super(inject);
        this.inject =inject;
        inject.classpath=this.getClass().getName();
    }

    @Given("^Browser \"([^\"]*)\" is launched$")
    public void browserIsLaunched(String strBrowser) throws Throwable {
        invokeApp(strBrowser);
        driver.manage().deleteAllCookies();
        if (!(globalEmail == null))
        {
                writePropertiesFile("email_id",globalEmail,globalParameters);
        }
        if (!(globalMobile == null))
        {
            writePropertiesFile("phone_Number",globalMobile,globalParameters);
        }
    }



    @And("^Navigate to \"([^\"]*)\" page$")
    public void navigateToPage(String arg0) throws Throwable {
        MyScreenRecorder.startRecording("navigateToPage");
        navigateTo(arg0,6);
    }

    @And("^Close Browser$")
    public void closeBrowser() throws Throwable {
        MyScreenRecorder.stopRecording();
        quitBrowser(driver);
    }
}
