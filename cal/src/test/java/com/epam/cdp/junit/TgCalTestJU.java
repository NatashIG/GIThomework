package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class TgCalTestJU extends BaseTestJU {

    @Test
    public void tgDoubleCorrectTestJU () {
        double result = calculator.tg(45.0);
        Assert.assertEquals("Incorrect tg operation result!", 1.6197 ,result,0.1);
    }
    @Test
    public void ctgDoubleCorrectTestJU () {
        double result = calculator.ctg(45.0);
        Assert.assertEquals("Incorrect tg operation result!", 1.7321 ,result, 0.1);
    }
}