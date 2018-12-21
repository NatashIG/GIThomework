package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class SqrtCalTestJU extends BaseTestJU {

    @Test
    public void sqrtDoubleCorrectTestJU () {
        double result = calculator.sqrt(10.24);
        Assert.assertEquals("Incorrect sqrt operation result!",3.2,result,0.1);
    }
    @Test
    public void sqrtDoubleIncorrectTestJU () {
        double result = calculator.sqrt(10.24);
        Assert.assertEquals("Incorrect sqrt operation result!",3.1,result,0.1);
    }
}
