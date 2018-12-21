package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultCalTest extends BaseTest {

    @Test
    public void multLongCorrectTest () {
        long result = calculator.mult(3,3);
        Assert.assertEquals(result,9,"Incorrect mult operation result!");
    }
    @Test
    public void multLongIncorrectTest () {
        long result = calculator.mult(2,3);
        Assert.assertEquals(result,5,"Incorrect mult operation result!");
    }
    @Test
    public void multDoubleCorrectTest () {
        double result = calculator.mult(3.1,2.0);
        Assert.assertEquals(result, 6.2,"Incorrect mult operation result!");
    }
    @Test
    public void multDoubleIncorrectTest () {
        double result = calculator.mult(3.1,2.0);
        Assert.assertEquals(result,6.6,"Incorrect mult operation result!");
    }
}
