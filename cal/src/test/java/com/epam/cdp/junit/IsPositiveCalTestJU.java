package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class IsPositiveCalTestJU extends BaseTestJU {

    @Test
    public void isPositiveCorrectTestJU() {
        boolean result = calculator.isPositive(60);
        Assert.assertEquals("Incorrect isPositive operation result!",true, result);
    }

    @Test
    public void isPositiveIncorrectTestJU() {
        boolean result = calculator.isPositive(-60);
        Assert.assertEquals("Incorrect isPositive operation result!",true, result);
    }

    @Test
    public void isPositiveZeroValueTestJU() {
        boolean result = calculator.isPositive(0);
        Assert.assertEquals("Incorrect isPositive operation result!",false, result);
    }
}
