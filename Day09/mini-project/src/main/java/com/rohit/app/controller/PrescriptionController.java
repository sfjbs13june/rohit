package com.rohit.app.controller;

import com.rohit.app.model.Prescription;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class PrescriptionController
{
    @GetMapping("/viewprescription")
    public List<Prescription> getAllPrescriptions(String patientName){

        return null;
    }

    @PostMapping("/saveprescription")
    public Prescription savePrescription(@RequestBody Prescription prescription){

        return prescription;
    }
}
