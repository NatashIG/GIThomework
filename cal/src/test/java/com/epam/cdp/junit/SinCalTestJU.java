package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class SinCalTestJU extends BaseTestJU {

    @Test
    public void sinDoubleCorrectTestJU () {
        double result = calculator.sin(60.0);
        Assert.assertEquals("Incorrect sin operation result!",-0.3048,result,0.1);
    }
    @Test
    public void sinDoubleIncorrectTestJU () {
        double result = calculator.sin(60.0);
        Assert.assertEquals("Incorrect sin operation result!",0.3048,result, 0.1);
    }
}
