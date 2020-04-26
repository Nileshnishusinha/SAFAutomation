package com.aig.testNg;

import org.testng.annotations.DataProvider;
public class DataProviderClass {

    @DataProvider(name = "data-provider")
    public static Object[][] dataProviderMethod()
    {
        String[][] data = new String[2][2];

        data[0][0] = "test 1";
        data[0][1] = "test 2";
        data[1][0] = "test 3";
        data[1][1] = "test 4";

        return data;
    }
}
