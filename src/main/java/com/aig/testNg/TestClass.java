package com.aig.testNg;

import com.aig.testNg.DataProviderClass;
import org.testng.annotations.Test;

public class TestClass
{
    @Test(dataProvider = "data-provider", dataProviderClass = DataProviderClass.class)
    public void testMethod(String s1, String s2)
    {
        System.out.println("s1 " + s1 + "s2 " + s2);
    }
}


