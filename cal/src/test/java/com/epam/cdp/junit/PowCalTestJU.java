package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class PowCalTestJU extends BaseTestJU {

    @Test
    public void powDoubleCorrectTestJU () {
        double result = calculator.pow(3.2,2.0);
        Assert.assertEquals("Incorrect pow operation result!",10.24 ,result, 0.1 );
    }
    @Test
    public void powDoubleIncorrectTestJU () {
        double result = calculator.pow(3.2,3.0);
        Assert.assertEquals("Incorrect pow operation result!",33.768,result,0.1);
    }
}
