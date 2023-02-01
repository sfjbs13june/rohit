package com.rohit.app.controller;

import com.rohit.app.model.Patient;
import com.rohit.app.repository.patientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/patientdata")
public class CreatedController {
  @Autowired
  patientRepository patientRepo;
  @RequestMapping(value = "/create", method = RequestMethod.POST)
  public Patient Create(@RequestBody Patient patient) {
    patient = patientRepo.save(patient);
    return patient;
  }

  @RequestMapping(value = "/read", method = RequestMethod.GET)
  public List<Patient> readPatient() {
    return patientRepo.findAll();
  }

  @RequestMapping(value = "/update", method = RequestMethod.PUT)
  public void modifyByID(@RequestParam String id, @RequestParam String name) {
    Patient patient = patientRepo.findByName(name);
    patient.setId(id);
    patientRepo.save(patient);
  }

  @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
  public void deleteById(@RequestParam String id) {
    patientRepo.deleteById(id);
  }

  @RequestMapping(value = "/findById", method = RequestMethod.GET)
  public void findByID(@RequestParam String id) {
    patientRepo.findById(id);
  }

  @RequestMapping(value = "/findByDisease", method = RequestMethod.GET)
  public void findByDisease(@RequestParam String disease) {
    patientRepo.findByDisease(disease);
  }

  @RequestMapping(value = "/deletedisease", method = RequestMethod.DELETE)
  public void deleteByDisease(@RequestParam String disease) {
    patientRepo.deleteByDisease(disease);
  }


}
