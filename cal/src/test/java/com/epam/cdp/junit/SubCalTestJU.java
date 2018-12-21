package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class SubCalTestJU extends BaseTestJU{

    @Test
    public void subLongCorrectTestJU () {
        long result = calculator.sub(2,2);
        Assert.assertEquals("Incorrect sub operation result!",0,result);
    }
    @Test
    public void subLongIncorrectTestJU () {
        long result = calculator.sub(2,2);
        Assert.assertEquals("Incorrect sub operation result!",1,result);
    }
    @Test
    public void subDoubleCorrectTestJU () {
        double result = calculator.sub(4.1,2.1);
        Assert.assertEquals("Incorrect sub operation result!",2.0, result, 0.1);
    }
    @Test
    public void subDoubleIncorrectTestJU () {
        double result = calculator.sub(2.1,3.1);
        Assert.assertEquals("Incorrect sub operation result!",0,result, 0.1);
    }
}
