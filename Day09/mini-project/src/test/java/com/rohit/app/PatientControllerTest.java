package com.rohit.app;

import com.rohit.app.controller.PatientController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class PatientControllerTest
{
    PatientController patientController = new PatientController();
    @Test
    public void testGetPatients()
    {
        int expectedSize=1;
        List result = patientController.getMyAppointments("rohan");
        Assertions.assertEquals(expectedSize,result.size());
    }

    @Test
    public void testMapPatients() {

        int expectedSize=1;
        Map result = patientController.mapPatient();
        Assertions.assertEquals(expectedSize, result.size());
    }
}
