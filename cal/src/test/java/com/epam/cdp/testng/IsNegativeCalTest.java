package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsNegativeCalTest extends BaseTest {

    @Test
    public void isNegativeCorrectTest() {
        boolean result = calculator.isNegative(60);
        Assert.assertEquals(result, false, "Incorrect isNegative operation result!");
    }

    @Test
    public void isNegativeIncorrectTest() {
        boolean result = calculator.isNegative(60);
        Assert.assertEquals(result, true, "Incorrect isNegative operation result!");
    }

    @Test
    public void isNegativeZeroValueTest() {
        boolean result = calculator.isPositive(0);
        Assert.assertEquals(result, false, "Incorrect isPositive operation result!");
    }
}