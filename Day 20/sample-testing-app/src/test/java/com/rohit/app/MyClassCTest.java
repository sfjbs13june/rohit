package com.rohit.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class MyClassCTest {
    @InjectMocks
    MyClassC myClassC;
    @Test
    public void getAgeTest() {
        int res = myClassC.getMyAge(24);
        assertEquals(24, res);
    }
}