package com.rohit.app.controller;

import com.rohit.app.model.Appointment;
import com.rohit.app.model.Prescription;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/Prescription")
public class PrescriptionController
{
    @GetMapping("/viewprescription")
    public List<Prescription> getAllPrescriptions(@RequestParam String patientName){
        List AP = new ArrayList();
        Prescription P1 = new Prescription("101","102","cold and fever","Rahul","Dr. Rajesh");
        AP.add(P1);
        return AP;
    }

    @PostMapping("/saveprescription")
    public Prescription savePrescription(@RequestBody Prescription prescription){
        System.out.println(prescription);
        return prescription;
    }

    @GetMapping("/Map/prescription")
    public Map MapPrescription()
    {
        Map MapPrescription = new HashMap();
        Prescription P1 = new Prescription("101","102","cold and fever","Rahul","Dr. Rajesh");
        MapPrescription.put(P1.getPrescriptionId(),P1);
        return MapPrescription;
    }
}
