package com.rohit.app;

import com.rohit.app.controller.DoctorController;
import com.rohit.app.repository.AppointmentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@RunWith(MockitoJUnitRunner.class)
@WebMvcTest({DoctorController.class})

public class DoctorControllerTest {

    @Autowired
    private DoctorController doctorController;

    @Mock
    private AppointmentRepository appointmentRepository;

    @Test
    public void testGetAppointment() throws Exception{

    }
}
