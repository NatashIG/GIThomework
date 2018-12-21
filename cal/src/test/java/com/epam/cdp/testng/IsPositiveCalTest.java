package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveCalTest extends BaseTest {

    @Test
    public void isPositiveCorrectTest() {
        boolean result = calculator.isPositive(60);
        Assert.assertEquals(result, true, "Incorrect isPositive operation result!");
    }

    @Test
    public void isPositiveIncorrectTest() {
        boolean result = calculator.isPositive(60);
        Assert.assertEquals(result, false, "Incorrect isPositive operation result!");
    }

    @Test
    public void isPositiveZeroValueTest() {
        boolean result = calculator.isPositive(0);
        Assert.assertEquals(result, false, "Incorrect isPositive operation result!");
    }
}