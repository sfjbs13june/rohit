package com.rohit.app.controller;

import com.rohit.app.model.Prescription;
import com.rohit.app.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController
{
    @Autowired
    PrescriptionRepository prescriptionRepository;
    @RequestMapping(value = "/viewprescription",method = RequestMethod.GET)
    public Prescription getAllPrescriptions(String patientName)
    {
        return prescriptionRepository.viewAll(patientName);
    }

    @RequestMapping(value = "/saveprescription",method = RequestMethod.POST)
    public Prescription savePrescription(@RequestBody Prescription prescription){
        prescription = prescriptionRepository.save(prescription);
        return prescription;
    }
}
