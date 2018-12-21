package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CosCalTest extends BaseTest {

    @Test (groups = "cos operation")
    public void cosDoubleCorrectTest () {
        double result = calculator.cos(60);
        Assert.assertEquals(result,-0.9524,0.1,"Incorrect cos operation result!");
    }
    @Test (groups = "cos operation")
    public void cosDoubleIncorrectTest () {
        double result = calculator.cos(60);
        Assert.assertEquals(result, -1,0.1, "Incorrect cos operation result!");
    }
}
