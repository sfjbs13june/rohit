package com.rohit.app;

import org.junit.Assert;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    @Test
    public void testSayWelcome() {
        String expectedResult = "welcome from greeting";
        Greeting g = new Greeting();
        String res = g.sayWelcome();
        Assert.assertEquals(expectedResult, res);
    }

    @Test
    public void testSayHello() {
        String expectedResult = "hello from greeting";
        Greeting h = new Greeting();
        String res = h.sayHello();
        Assert.assertEquals(expectedResult, res);
    }

    @Test
    public void testSayBye() {
        String expectedResult = "bye from greeting";
        Greeting i = new Greeting();
        String res = i.sayBye();
        Assert.assertEquals(expectedResult,res);
    }
}
