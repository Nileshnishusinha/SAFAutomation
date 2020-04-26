package com.aig.stepDefinition;

import com.aig.cucumber.CustomElementFunctions;

import java.util.Hashtable;

public class Injection {
    public static boolean tunnelId;
    public Hashtable<String,Object> scenarioDataTable = new Hashtable<>();
    public static Hashtable<String,Object> globalDataTable = new Hashtable<>();
    public static String globalParameterFile = "\\src\\test\\resources\\RunConfig.properties";
    public String strBrowser;
    public String strMobileOS;
    public String classpath="";

    public <TPage extends CustomElementFunctions> TPage getPage (Class<TPage> pageClass)
    {
        try{
            return pageClass.getConstructor(Injection.class).newInstance(this);
        }
        catch (Exception e)
        {
        e.printStackTrace();
        return null;
        }
    }
}
