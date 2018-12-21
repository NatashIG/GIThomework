package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TgCalTest extends BaseTest {

    @Test
    public void tgDoubleCorrectTest () {
        double result = calculator.tg(45.0);
        Assert.assertEquals(result,1.6197 ,0.1,"Incorrect tg operation result!");
    }
    @Test
    public void ctgDoubleCorrectTest () {
        double result = calculator.ctg(45.0);
        Assert.assertEquals(result,1.7321 ,"Incorrect ctg operation result!");
    }
}
