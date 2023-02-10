package com.rohit.app;

import com.rohit.app.controller.DoctorController;
import com.rohit.app.model.Appointment;
import com.rohit.app.model.Prescription;
import com.rohit.app.repository.AppointmentRepository;
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
public class DoctorControllerTest {

    @InjectMocks
    DoctorController doctorController;

    @Mock
    private AppointmentRepository appRepo;

    @Mock
    private Appointment appointment;

    @BeforeEach
    void setUp() {
        appointment = Mockito.mock(Appointment.class);
        appRepo = Mockito.mock(AppointmentRepository.class);
    }
    @Test
    public void getAppointmentsTest()
    {
        List<Appointment> ap1 = new ArrayList();
        Appointment appointment = new Appointment();
        appointment.setAppointmentId("123");
        appointment.setPatientName("Ram");
        appointment.setDoctorName("Dr.pandey");
        appointment.setDate("23 feb");
        ap1.add(appointment);
        Prescription prescription = new Prescription("101","102","he had fever","Ram","Dr.pandey");
        appointment.setPrescription(prescription);
        when(appRepo.findBydoctorName(anyString())).thenReturn(ap1);
        List<Appointment> result = doctorController.getAppointments("Dr.pandey");
        assertEquals(ap1.size(), 1);
        assertEquals(ap1.get(0).getAppointmentId(),result.get(0).getAppointmentId());
        assertEquals(ap1.get(0).getPatientName(),result.get(0).getPatientName());
        assertEquals(ap1.get(0).getDoctorName(),result.get(0).getDoctorName());
        assertEquals(ap1.get(0).getDate(),result.get(0).getDate());
        assertEquals(ap1.get(0).getPrescription().getPrescriptionId(),result.get(0).getPrescription().getPrescriptionId());
        assertEquals(ap1.get(0).getPrescription().getAppointmentId(), result.get(0).getPrescription().getAppointmentId());
        assertEquals(ap1.get(0).getPrescription().getPatientName(),result.get(0).getPrescription().getPatientName());
        assertEquals(ap1.get(0).getPrescription().getDoctorName(),result.get(0).getPrescription().getDoctorName());
        assertEquals(ap1.get(0).getPrescription().getDescription(),result.get(0).getPrescription().getDescription());
    }

    @Test
    public void saveAppointmentTest(){
        Appointment ap1 = new Appointment();
        when(appRepo.save(any(Appointment.class))).thenReturn(ap1);
        Appointment result = doctorController.saveAppointment(appointment);
        assertEquals(ap1,result);
    }
}
