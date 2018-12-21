package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class DivCalTestJU extends BaseTestJU {

    @Test
    public void divLongCorrectTestJU() {
        long result = calculator.div(6, 3);
        Assert.assertEquals("Incorrect div operation result!",2, result);
    }

    @Test
    public void divLongIncorrectTestJU() {
        long result = calculator.div(6, 3);
        Assert.assertEquals("Incorrect div operation result!",3, result);
    }

    @Test
    public void divByZeroLongIncorrectTestJU() {
        long result = calculator.div(6, 0);
        Assert.assertEquals("Incorrect div operation result!",0, result);
    }

    @Test
    public void divDoubleCorrectTestJU() {
        double result = calculator.div(3.2, 1.6);
        Assert.assertEquals("Incorrect div operation result!",2.0, result,0.1);
    }

    @Test
    public void divDoubleIncorrectTestJU() {
        double result = calculator.div(3.2, 1.6);
        Assert.assertEquals("Incorrect div operation result!",2.1,result, 0.1);
    }

    @Test
    public void divByZeroDoubleIncorrectTestJU() {
        double result = calculator.div(6.2, 0);
        Assert.assertEquals("Incorrect div operation result!",0,result, 0.1);
    }
}