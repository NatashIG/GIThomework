package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class IsNegativeCalTestJU extends BaseTestJU {

    @Test
    public void isNegativeCorrectTestJU() {
        boolean result = calculator.isNegative(60);
        Assert.assertEquals("Incorrect isNegative operation result!",false,result);
    }

    @Test
    public void isNegativeIncorrectTestJU() {
        boolean result = calculator.isNegative(60);
        Assert.assertEquals("Incorrect isNegative operation result!",true,result);
    }

    @Test
    public void isNegativeZeroValueTestJU() {
        boolean result = calculator.isPositive(0);
        Assert.assertEquals("Incorrect isNegative operation result!",false, result);
    }
}
