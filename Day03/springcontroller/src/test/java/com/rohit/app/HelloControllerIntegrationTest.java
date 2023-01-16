package com.rohit.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class HelloControllerIntegrationTest
{
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHelloControllerIntegrationHello() throws Exception
    {
        ResultActions responseEntity = mockMvc.perform(get("/hello"));
        responseEntity.andExpect(status().isOk());
        String res=responseEntity.andReturn().getResponse().getContentAsString();
        assertEquals("Hello from App",res);
    }

    @Test
    public void testHelloControllerIntegrationRequestHello() throws Exception
    {
        ResultActions responseEntity = mockMvc.perform(get("/request/hello"));
        responseEntity.andExpect(status().isOk());
        String res=responseEntity.andReturn().getResponse().getContentAsString();
        assertEquals("Hello from request mapping",res);
    }

}
