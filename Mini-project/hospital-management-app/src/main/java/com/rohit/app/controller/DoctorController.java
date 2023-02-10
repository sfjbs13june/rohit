package com.rohit.app.controller;

import com.rohit.app.model.Appointment;
import com.rohit.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/doctor")
public class DoctorController
{
    @Autowired
    AppointmentRepository apprepository;
    @RequestMapping(value = "/doctorappointment",method = RequestMethod.GET)
    public List<Appointment> getAppointments(@RequestParam("doctorName") String doctorName)
    {
        return apprepository.findBydoctorName(doctorName);
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public Appointment saveAppointment(@RequestBody Appointment appointment)
    {
        appointment = apprepository.save(appointment);
        System.out.println("Data Saved : " );
        return appointment;
    }
}
