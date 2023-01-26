package com.rohit.app.controller;

import com.rohit.app.model.Appointment;
import com.rohit.app.model.Prescription;
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
        Ap.add(ap1);
        return Ap;
    }

    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment) {
        System.out.println(appointment);
        return appointment;
    }

    @GetMapping("/map/patient")
    public Map mapPatient()
    {
        Map mapPatient = new HashMap();
        Prescription P1 = new Prescription("101","102","cold and fever","Rahul","Dr. Rajesh");
        mapPatient.put(P1.getPatientName(),P1);
        return mapPatient;
    }
}