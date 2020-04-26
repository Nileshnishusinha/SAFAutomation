package com.aig.stepDefinition;

import java.io.File;

public enum ExtentProperties {
    INSTANCE;

    private String reportPath;
    private String projectName;
    private  ExtentProperties()
    {
        this.reportPath ="output" + File.separator +"Run" + System.currentTimeMillis() + File.separator + "report.html";
    }

    public String getReportPath(){return  this.reportPath;}

    public  void setReportPath(String reportPath) {this.reportPath =reportPath;}


}
