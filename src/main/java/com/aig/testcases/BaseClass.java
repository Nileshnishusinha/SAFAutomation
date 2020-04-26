package com.aig.testcases;

import com.aig.cucumber.CustomElementFunctions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    public WebDriver driver;
    @BeforeClass
    public void setup()
    {
      driver = CustomElementFunctions.startApplication(driver,"chrome","");
    }

    @AfterClass
    public void tearDown()
    {
        CustomElementFunctions.quitBrowser(driver);
    }
}
