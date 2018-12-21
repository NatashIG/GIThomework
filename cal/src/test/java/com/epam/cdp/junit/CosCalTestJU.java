package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class CosCalTestJU extends BaseTestJU {

    @Test
    public void cosDoubleCorrectTestJU () {
        double result = calculator.cos(60);
        Assert.assertEquals("Incorrect cos operation result!",-0.9524,result,0.1);
    }
    @Test
    public void cosDoubleIncorrectTestJU () {
        double result = calculator.cos(60);
        Assert.assertEquals("Incorrect cos operation result!",-1,result, 0.1);
    }
}
