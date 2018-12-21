package com.epam.cdp.testng;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Before class");
    }

    @AfterClass
    public void tearDown() {
        calculator = null;
    }

    @BeforeTest
    public void BeforeTest (){
        System.out.println("Run this test");
    }

    @BeforeMethod
    public void BeforeMethod () {
        System.out.println("Method starts");
    }
}
