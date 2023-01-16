package com.rohit.app;

import org.junit.Assert;
import org.junit.Test;

public class GreetingControllerTest {
    GreetingController gc = new GreetingController();
    @Test
    public void testDoGreet()
    {
        String expectedresult="greet from app";
        String res= gc.DoGreet();
        Assert.assertEquals(expectedresult,res);
    }

    @Test
    public void testSayWelcome()
    {
        String expectedresult="welcome from app";
        String res= gc.SayWelcome();
        Assert.assertEquals(expectedresult,res);
    }

    @Test
    public void testSayHi()
    {
        String expectedresult="hi from app";
        String res= gc.SayHi();
        Assert.assertEquals(expectedresult,res);
    }

    @Test
    public void testSayThanks()
    {
        String expectedresult="thanks from app";
        String res= gc.SayThanks();
        Assert.assertEquals(expectedresult,res);
    }
}
