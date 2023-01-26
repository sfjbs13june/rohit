package com.rohit.app;

import com.rohit.app.controller.DoctorController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class DoctorControllerTest
{
    DoctorController doctorController = new DoctorController();
    @Test
    public void testGetDoctors()
    {
        int expectedSize=2;
        List result = doctorController.getAppointments();
        Assertions.assertEquals(expectedSize,result.size());
    }

    @Test
    public void testMapDoctors() {

        int expectedSize = 2;
        Map result = doctorController.mapDoctor();
        Assertions.assertEquals(expectedSize, result.size());
    }
}
