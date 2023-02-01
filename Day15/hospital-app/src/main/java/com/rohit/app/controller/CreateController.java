package com.rohit.app.controller;


import com.rohit.app.model.Hospital;
import com.rohit.app.repository.hospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/hospital")
public class CreateController {
  @Autowired
  hospitalRepository hospitalRepo;
  @RequestMapping(value = "/create", method = RequestMethod.POST)
  public Hospital create(@RequestBody Hospital hospital) {
    hospital = hospitalRepo.save(hospital);
    return hospital;
  }

  @RequestMapping(value = "/read", method = RequestMethod.GET)
  public List<Hospital> readHospital() {
    return hospitalRepo.findAll();
  }

  @RequestMapping(value = "/update", method = RequestMethod.PUT)
  public void modifyByID(@RequestParam String id, @RequestParam String name) {
    Hospital hospital = hospitalRepo.findByName(name);
    hospital.setId(id);
    hospitalRepo.save(hospital);
  }

  @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
  public void deleteByID(@RequestParam String name) {
    hospitalRepo.deleteByName(name);
  }

  @RequestMapping(value = "/findByid", method = RequestMethod.GET)
  public void findByID(@RequestParam String id) {
    hospitalRepo.findById(id);
  }

}
