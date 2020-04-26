//package com.aig.stepDefinition;
package com.cucumber.listener;
import com.aventstack.extentreports.ExtentTest;
import com.cucumber.listener.ExtentCucumberFormatter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.ExtentReports;
import gherkin.formatter.model.Match;
import gherkin.formatter.model.Result;
import sun.management.snmp.util.MibLogger;

/**
 * Interface for reporting results. This is a different interface from Formatter,
 * which also knows how to print gherkin source. They are separate, because some
 * Reporter implementations (such as Cucumber's JUnitReporter) only cares about results,
 */
public class Reporter {

    private  Reporter()
    {

    }

    public  static void addStepLog(String message)
    {
        getCurrentStep().info(message);
    }

     private static ExtentTest getCurrentStep() {
      return (ExtentTest) ExtentCucumberFormatter.stepTestThreadLocal.get();
    }
}
