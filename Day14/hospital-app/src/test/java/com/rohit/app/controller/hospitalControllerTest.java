package com.rohit.app.controller;

import com.rohit.app.model.Hospital;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.ArrayList;
import java.util.List;

import com.rohit.app.repository.hospitalRepository;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class hospitalControllerTest
{
    @InjectMocks
    private HospitalDataController hospitalDataController;
    @Mock
    private hospitalRepository hosRepository;

    @Test
    public void getAllTest(){
        Hospital h1=new Hospital();
        h1.setId("1");
        h1.setName("test");
        h1.setCity("bhilwara");;
        List<Hospital> hosList=new ArrayList<>();
        hosList.add(h1);
        when(hosRepository.findAll()).thenReturn(hosList);
        List<Hospital> results = (List<Hospital>) hospitalDataController.getAll();
        Hospital result =results.get(0);
        assertEquals("1",result.getId());
        assertEquals("test",result.getName());
        assertEquals("bhilwara",result.getCity());
    }

    @Test
    public void storeTest(){
    }
}
