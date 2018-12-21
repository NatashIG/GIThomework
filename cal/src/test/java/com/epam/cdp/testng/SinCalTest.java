package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SinCalTest extends BaseTest {

    @Test
    public void sinDoubleCorrectTest () {
        double result = calculator.sin(60.0);
        Assert.assertEquals(result,-0.3048,0.1,"Incorrect sin operation result!");
    }
    @Test
    public void sinDoubleIncorrectTest () {
        double result = calculator.sin(60.0);
        Assert.assertEquals(result, 0.3048,0.1, "Incorrect sin operation result!");
    }
}
