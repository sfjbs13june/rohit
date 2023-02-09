package com.rohit.app;

import com.rohit.app.controller.DoctorController;
import com.rohit.app.repository.AppointmentRepository;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DoctorControllerTest
{
    @InjectMocks
    private DoctorController doctorController;

    @Mock
    private AppointmentRepository appointmentRepository;

    @BeforeEach
    void setUp()
    {
        appointmentRepository = Mockito.mock(AppointmentRepository.class);
    }

    @Test
    public void getDoctorAppointmentTest()
    {
    }
}
