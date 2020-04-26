package com.aig.pages;

import com.aig.cucumber.CustomElementFunctions;
import com.aig.stepDefinition.Injection;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VolPage extends CustomElementFunctions {
    public VolPage(Injection inject) {
        super(inject);
    }


    public void validateTheExpectedTitleAs(String arg0) {

        String actual = driver.getTitle();
        String expected = arg0;
//       if (actual.equalsIgnoreCase(expected))
//       {
//           System.out.println("test case passed");
//       }
//       else
//           System.out.println("test case failed");
//    }
        Assert.assertTrue("Title of the webpage not matched ",actual.equalsIgnoreCase(expected));
    }
}
