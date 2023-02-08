package com.rohit.app;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MyClassBTest
{
    @InjectMocks
    MyclassB myclassB;

    @Mock
    MyClassC myClassC;

    @BeforeEach
    void setup()
    {
        myClassC = Mockito.mock(MyClassC.class);
    }

    @Test
    public void TestMethod1() {
        String result = myclassB.getResult();
        assertEquals("my result", result);
    }


    @Test
    public void getMyStringTest(){
        String result = myclassB.getMyString("my data");
        assertEquals("my result my data",result);
    }

    @Test
    public void getClassCResultTest(){
        when(myClassC.getMyAge(anyInt())).thenReturn(25);
        int res = myclassB.getClassCResult(myClassC);
        assertEquals(25,res);
    }


    @Test
    public void noreturnDataTst(){
        myclassB.NoreturnData("my data");
        String result = "my data";
        assertEquals("my data" , result);

    }
}
