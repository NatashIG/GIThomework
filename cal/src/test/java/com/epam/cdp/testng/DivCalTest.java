package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivCalTest extends BaseTest {

    @Test
    public void divLongCorrectTest() {
        long result = calculator.div(6, 3);
        Assert.assertEquals(result, 2, "Incorrect div operation result!");
    }

    @Test
    public void divLongIncorrectTest() {
        long result = calculator.div(6, 3);
        Assert.assertEquals(result, 3, "Incorrect div operation result!");
    }

    @Test
    public void divByZeroLongIncorrectTest() {
        long result = calculator.div(6, 0);
        Assert.assertEquals(result, 0, "Incorrect div operation result!");
    }

    @Test
    public void divDoubleCorrectTest() {
        double result = calculator.div(3.2, 1.6);
        Assert.assertEquals(result, 2.0, "Incorrect div operation result!");
    }

    @Test
    public void divDoubleIncorrectTest() {
        double result = calculator.div(3.2, 1.6);
        Assert.assertEquals(result, 2.1, "Incorrect div operation result!");
    }

    @Test
    public void divByZeroDoubleIncorrectTest() {
        double result = calculator.div(6.2, 0);
        Assert.assertEquals(result, 0, "Incorrect div operation result!");
    }
}