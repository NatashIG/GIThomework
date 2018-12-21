package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubCalTest extends BaseTest{

    @Test
    public void subLongCorrectTest () {
        long result = calculator.sub(2,2);
        Assert.assertEquals(result,0,"Incorrect sub operation result!");
    }
    @Test
    public void subLongIncorrectTest () {
        long result = calculator.sub(2,2);
        Assert.assertEquals(result,1,"Incorrect sub operation result!");
    }
    @Test
    public void subDoubleCorrectTest () {
        double result = calculator.sub(4.1,2.1);
        Assert.assertEquals(result,2.0, 0.1,"Incorrect sub operation result!");
    }
    @Test
    public void subDoubleIncorrectTest () {
        double result = calculator.sub(2.1,3.1);
        Assert.assertEquals(result,0,"Incorrect sub operation result!");
    }
}
