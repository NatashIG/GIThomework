package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class SumCalTestJU extends BaseTestJU {

    @Test
    public void sumLongCorrectTestJU () {
        long result = calculator.sum(2,2);
        Assert.assertEquals("Incorrect sum operation result!",4,result);
    }
    @Test
    public void sumLongIncorrectTestJU () {
        long result = calculator.sum(2,2);
        Assert.assertEquals("Incorrect sum operation result!",3,result);
    }
    @Test
    public void sumDoubleCorrectTestJU () {
        double result = calculator.sum(2.1,2.1);
        Assert.assertEquals("Incorrect sum operation result!",4.2,result, 0.1);
    }
    @Test
    public void sumDoubleIncorrectTestJU () {
        double result = calculator.sum(2.1,2.1);
        Assert.assertEquals("Incorrect sum operation result!",4,result, 0.1);
    }
}