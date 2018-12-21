package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class CtgCalTestJU extends BaseTestJU  {

    @Test
    public void ctgDoubleCorrectTestJU () {
        double result = calculator.ctg(60.0);
        Assert.assertEquals("Incorrect ctg operation result!",3.1246, result,0.1);
    }
    @Test
    public void ctgDoubleIncorrectTestJU () {
        double result = calculator.ctg(60.0);
        Assert.assertEquals("Incorrect ctg operation result!",3.0, result,0.1);
    }
}

