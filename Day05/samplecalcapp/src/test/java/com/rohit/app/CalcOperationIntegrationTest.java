package com.rohit.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@RunWith(SpringRunner.class)
@WebMvcTest(CalcOperation.class)

public class CalcOperationIntegrationTest
{
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void CalcOperationIntegrationTestAdd() throws Exception
    {
        long a = (long) 5.0;
        long b = (long) 4.0;
        ResultActions response = mockMvc.perform(get("/add").param("a", String.valueOf(a)).param("b", String.valueOf(b)));
        response.andExpect(status().isOk());
        String res = response.andReturn().getResponse().getContentAsString();
        System.out.println(res);
        assertEquals("9",res);
    }

    @Test
    public void CalcOperationIntegrationTestSub() throws Exception
    {
        long a = (long) 12.0;
        long b = (long) 5.0;
        ResultActions response = mockMvc.perform(post("/sub").param("a", String.valueOf(a)).param("b", String.valueOf(b)));
        response.andExpect(status().isOk());
        String res = response.andReturn().getResponse().getContentAsString();
        System.out.println(res);
        assertEquals("7",res);
    }

    @Test
    public void CalcOperationIntegrationTestMul() throws Exception
    {
        long a = (long) 15.0;
        long b = (long) 9.0;
        ResultActions response = mockMvc.perform(put("/mul").param("a",String.valueOf(a)).param("b",String.valueOf(b)));
        response.andExpect(status().isOk());
        String res = response.andReturn().getResponse().getContentAsString();
        System.out.println(res);
        assertEquals("135",res);
    }

    @Test
    public void CalcOperationIntegrationTestDiv() throws Exception
    {
        long a = (long) 9.0;
        long b = (long) 3.0;
        ResultActions response = mockMvc.perform(delete("/div").param("a",String.valueOf(a)).param("b",String.valueOf(b)));
        response.andExpect((status().isOk()));
        String res = response.andReturn().getResponse().getContentAsString();
        System.out.println(res);
        assertEquals("3",res);
    }
}
