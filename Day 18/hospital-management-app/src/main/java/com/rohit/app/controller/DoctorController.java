package com.rohit.app.controller;

import com.rohit.app.model.Appointment;
import com.rohit.app.model.Prescription;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/doctorappointment")
public class DoctorController
{
    Prescription prescription;
    public List<Appointment> getAppointments(@RequestParam("doctorName") String doctorName)
    {
        List ap = new ArrayList();
        //Appointment AP1 = new Appointment("101","Rahul","Dr. Rajesh","23-02-2023","");
        return null;
    }
}
