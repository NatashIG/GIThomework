package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SqrtCalTest extends BaseTest {

    @Test
    public void sqrtDoubleCorrectTest () {
        double result = calculator.sqrt(10.24);
        Assert.assertEquals(result,3.2 ,"Incorrect sqrt operation result!");
    }
    @Test
    public void sqrtDoubleIncorrectTest () {
        double result = calculator.sqrt(10.24);
        Assert.assertEquals(result,3.1,"Incorrect sqrt operation result!");
    }
}
