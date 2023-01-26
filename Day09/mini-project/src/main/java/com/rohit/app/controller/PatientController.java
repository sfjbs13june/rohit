package com.rohit.app.controller;

import com.rohit.app.model.Appointment;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/patient")
public class PatientController {
    @GetMapping("/myappointment")
    public List<Appointment> getMyAppointments(@RequestParam String patientName) {
        List Ap = new ArrayList();
        Appointment ap1 = new Appointment("102","Rahul","Dr. Rajesh","25-01-2023");
        Appointment ap2 = new Appointment("104","Rohan","Dr. Deepak","25-01-2023");

        Ap.add(ap1);
        Ap.add(ap2);
        return Ap;
    }

    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment) {
        System.out.println(appointment);
        return appointment;
    }

    @GetMapping("/map/patient")
    public Map mapDoctor()
    {
        Map mapDoctor = new HashMap();
        Appointment A1 = new Appointment("102","Rahul","Dr. Rajesh","25-01-2023");
        Appointment A2 = new Appointment("104","Rohan","Dr. Deepak","25-01-2023");

        mapDoctor.put(A1.getPatientName(),A1);
        mapDoctor.put(A2.getPatientName(),A2);
        return mapDoctor;
    }
}