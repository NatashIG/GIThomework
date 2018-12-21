package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowCalTest extends BaseTest {

    @Test (dataProvider ="valuesForPowTest")
    public void powDoubleCorrectTest (double a, double b, double expectedValue) {
        double result = calculator.pow(a,b);
        Assert.assertEquals(result,expectedValue,0.1, "Incorrect pow operation result!");
    }
    @Test
    public void powDoubleIncorrectTest () {
        double result = calculator.pow(3.2,3.0);
        Assert.assertEquals(result,33.768,0.1,"Incorrect pow operation result!");
    }
    @DataProvider (name = "valuesForPowTest")
    public Object[][] valuesForPow() {
        return new Object[][] {
            {1.1,3.0,1.331},
            {-2.0, 4.0, 16.0},
            {0.5, 2.0,0.25}
        };
    }
}
