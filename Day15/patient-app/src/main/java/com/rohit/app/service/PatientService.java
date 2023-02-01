package com.rohit.app.service;

import com.rohit.app.model.Patient;
import org.springframework.stereotype.Component;

@Component
public class PatientService
{
    public Patient updateDetail(Patient patient, String disease)
    {
        patient.setDisease(disease);
        //patient.setAge(age);
        return patient;
    }
}
