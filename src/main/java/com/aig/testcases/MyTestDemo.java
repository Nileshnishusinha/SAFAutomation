package com.aig.testcases;

import com.aig.cucumber.CustomElementFunctions;
import com.aig.stepDefinition.Common;
import com.aig.stepDefinition.Injection;
import com.aig.utility.MyScreenRecorder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyTestDemo extends CustomElementFunctions {
    public MyTestDemo(Injection inject) {
        super(inject);
    }
    public void navigationTest() throws Exception{
//        MyScreenRecorder.startRecording("navigationTest");
        navigateTo("http://www.google.com",6);
        navigateTo("http://www.facebook.com",6);
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().back();
        driver.navigate().forward();

//        MyScreenRecorder.stopRecording();
    }
    public void navigation_FeatureTest() throws Exception{
        MyScreenRecorder.startRecording("navigation_FeatureTest");

        driver.get("http://www.amazon.com");
        driver.navigate().to("http://www.rediff.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().back();
        driver.navigate().forward();

        MyScreenRecorder.stopRecording();
    }
}