package com.rohit.app;

import com.rohit.app.controller.PatientController;
import com.rohit.app.model.Appointment;
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
public class PatientControllerTest
{
    @InjectMocks
    private PatientController patientController;

    @Mock
    private Appointment appointment;

    @Mock
    private AppointmentRepository appRepository;

    @BeforeEach
    void setUp() {
        appointment = Mockito.mock(Appointment.class);
        appRepository = Mockito.mock(AppointmentRepository.class);
    }

    @Test
    public void getPatientTest()
    {
        List<Appointment> patient = new ArrayList();
        when(appRepository.findByPatientName(anyString())).thenReturn(patient);
        List result=patientController.getMyAppointments("Ram");
        assertEquals(patient,result);
    }

    @Test
    public void SavePatientTest()
    {
        Appointment app =new Appointment();
        when(appRepository.save(any(Appointment.class))).thenReturn(app);
        Appointment result=patientController.saveAppointment(appointment);
        assertEquals(app,result);
    }
}
