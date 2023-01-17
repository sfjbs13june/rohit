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

    @Test
    public void testrequestWelcome()
    {
        String name = "world";
        String expectedresult = "Welcome to "+name;
        String res = hc.welcome(name);
        Assert.assertEquals(expectedresult, res);
    }

    @Test
    public void testrequestSendMessage()
    {
        String message = "world";
        String expectedresult = "send message to "+message;
        String res = hc.sendMessage(message);
        Assert.assertEquals(expectedresult, res);
    }
}
