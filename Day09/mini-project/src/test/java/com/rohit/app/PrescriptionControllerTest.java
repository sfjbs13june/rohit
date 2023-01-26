package com.rohit.app;

import com.rohit.app.controller.DoctorController;
import com.rohit.app.controller.PatientController;
import com.rohit.app.controller.PrescriptionController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class PrescriptionControllerTest
{
    PrescriptionController prescriptionController = new PrescriptionController();
    @Test
    public void testGetPrescription()
    {
        int expectedSize=1;
        List result = prescriptionController.getAllPrescriptions("rahul");
        Assertions.assertEquals(expectedSize,result.size());
    }

    @Test
    public void testMapDoctors() {

        int expectedSize = 1;
        Map result = prescriptionController.MapPrescription();
        Assertions.assertEquals(expectedSize, result.size());
    }
}
