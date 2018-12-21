package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CtgCalTest extends BaseTest {

    @Test
    public void ctgDoubleCorrectTest () {
        double result = calculator.ctg(60.0);
        Assert.assertEquals(result,3.1246,0.1 ,"Incorrect ctg operation result!");
    }
    @Test
    public void ctgDoubleIncorrectTest () {
        double result = calculator.ctg(60.0);
        Assert.assertEquals(result,3.0,0.1,"Incorrect ctg operation result!");
    }
}
