package com.rohit.app;

import com.rohit.app.controller.PrescriptionController;
import com.rohit.app.model.Prescription;
import com.rohit.app.repository.PrescriptionRepository;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PrescriptionControllerTest
{
    @InjectMocks
    PrescriptionController prescriptionController;
    @Mock
    Prescription prescription;
    @Mock
    PrescriptionRepository prescriptionRepository;

    @BeforeEach
    public void setUp()
    {
        prescription = Mockito.mock(Prescription.class);
        prescriptionRepository = Mockito.mock(PrescriptionRepository.class);
    }

    @Test
    public void SavePrescriptionTest()
    {
        Prescription pres1 = new Prescription();
        when(prescriptionRepository.save(any(Prescription.class))).thenReturn(pres1);
        Prescription result = prescriptionController.savePrescription(prescription);
        assertEquals(pres1,result);
    }

    @Test
    public void getPatientTest(){
        List ap2 =new ArrayList();
        when(prescriptionRepository.findByPatientName(anyString())).thenReturn(ap2);
        List result=prescriptionController.getAllPrescriptions("Ram");
        assertEquals(ap2,result);
    }

    @Test
    public void getPrescriptionDetailsTest()
    {
        List<Prescription> prescriptions = new ArrayList();
        Prescription pres1 = new Prescription("pres013", "105", "fever", "Ram", "Dr.pandey");
        prescriptions.add(pres1);
        when(prescriptionRepository.findAll()).thenReturn(prescriptions);
        List<Prescription> result = prescriptionController.getAllPrescriptions("Ram");
        assertEquals(prescriptions.size(), 1);
        assertEquals(prescriptions.get(0).getPrescriptionId(), result.get(0).getPrescriptionId());
        assertEquals(prescriptions.get(0).getAppointmentId(), result.get(0).getAppointmentId());
        assertEquals(prescriptions.get(0).getDescription(), result.get(0).getDescription());
        assertEquals(prescriptions.get(0).getPatientName(), result.get(0).getPatientName());
        assertEquals(prescriptions.get(0).getDoctorName(), result.get(0).getDoctorName());
    }
}
