package com.rohit.app.controller;

import com.rohit.app.exception.*;
import com.rohit.app.exception.PatientAgeNotFoundException;
import com.rohit.app.exception.PatientIdNotFoundException;
import com.rohit.app.model.Patient;
import com.rohit.app.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController
{
    @Autowired
    PatientService patientService;
    @PostMapping("/patient/save")
    public Patient savePatient(@RequestBody Patient patient) throws PatientIdNotFoundException, PatientNameNotFoundException, PatientAgeNotFoundException, PatientGenderNotFoundException, PatientDiseaseNotFoundException {
        if(patient.getId()==null)
        {
            throw new PatientIdNotFoundException("There is no patient available");
        }
        if(patient.getName()==null)
        {
            throw new PatientNameNotFoundException("There is not Patient name here.");
        }
        if(patient.getAge()==null)
        {
            throw new PatientAgeNotFoundException("Patient age is not found.");
        }
        if(patient.getGender()==null)
        {
            throw new PatientGenderNotFoundException("Patient Gender is not found");
        }
        if(patient.getDisease()==null)
        {
            throw new PatientDiseaseNotFoundException("Patient disease id not found.");
        }
        System.out.println(patient);
        return patient;
    }
    @PutMapping("/patient/update")
    public Patient updatePatient(@RequestBody Patient patient,@RequestParam("disease") String disease)
    {
        return patientService.updateDetail(patient,disease);
    }
}
