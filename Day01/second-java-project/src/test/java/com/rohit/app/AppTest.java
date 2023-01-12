package com.rohit.app;

import junit.framework.TestCase;
import junit.framework.TestSuite;
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
    public void testsayWelcome() {
        String expectedResult = "welcome from greeting";
        Greeting g = new Greeting();
        String res = g.sayWelcome();
        Assert.assertEquals(expectedResult, res);
    }

    @Test
    public void testsayHello() {
        String expectedResult = "hello from greeting";
        Greeting h = new Greeting();
        String res = h.sayHello();
        Assert.assertEquals(expectedResult, res);
    }

    @Test
    public void testsayBye() {
        String expectedResult = "bye from greeting";
        Greeting i = new Greeting();
        String res = i.sayBye();
        Assert.assertEquals(expectedResult,res);
    }
}
