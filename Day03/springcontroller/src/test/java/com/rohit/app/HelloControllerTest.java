package com.rohit.app;

import org.junit.Assert;
import org.junit.Test;

public class HelloControllerTest
{
    HelloController hc = new HelloController();
    @Test
    public void testSayHello()
    {
        String expectedresult="Hello from App";
        String res=hc.SayHello();
        Assert.assertEquals(expectedresult,res);
    }

    @Test
    public void testrequestHello()
    {
        String expectedresult="Hello from request mapping";
        String res=hc.RequestHello();
        Assert.assertEquals(expectedresult,res);
    }
}
