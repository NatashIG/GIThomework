package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumCalTest extends BaseTest{

    @Test
    public void sumLongCorrectTest () {
      long result = calculator.sum(2,2);
        Assert.assertEquals(result,4,"Incorrect sum operation result!");
    }
    @Test
    public void sumLongIncorrectTest () {
        long result = calculator.sum(2,2);
        Assert.assertEquals(result,3,"Incorrect sum operation result!");
    }
    @Test
    public void sumDoubleCorrectTest () {
        double result = calculator.sum(2.1,2.1);
        Assert.assertEquals(result,4.2,"Incorrect sum operation result!");
    }
    @Test
    public void sumDoubleIncorrectTest () {
        double result = calculator.sum(2.1,2.1);
        Assert.assertEquals(result,4,"Incorrect sum operation result!");
    }
}
