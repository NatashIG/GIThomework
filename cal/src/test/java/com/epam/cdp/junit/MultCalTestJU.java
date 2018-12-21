package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class MultCalTestJU extends BaseTestJU {

    @Test
    public void multLongCorrectTestJU () {
        long result = calculator.mult(3,3);
        Assert.assertEquals("Incorrect mult operation result!",9,result);
    }
    @Test
    public void multLongIncorrectTestJU () {
        long result = calculator.mult(2,3);
        Assert.assertEquals("Incorrect mult operation result!",5,result);
    }
    @Test
    public void multDoubleCorrectTestJU () {
        double result = calculator.mult(3.1,2.0);
        Assert.assertEquals("Incorrect mult operation result!",6.2,result,0.1);
    }
    @Test
    public void multDoubleIncorrectTestJU () {
        double result = calculator.mult(3.1,2.0);
        Assert.assertEquals("Incorrect mult operation result!",6.6,result,0.1);
    }
}