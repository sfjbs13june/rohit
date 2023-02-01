package com.rohit.app.repository;

import com.rohit.app.model.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface patientRepository extends MongoRepository<Patient,String>
{
    public Optional<Patient> findById(String id);
    public Patient findByName(String name);

    public Patient findByDisease(String disease);
    public void deleteByName(String name);

    public void deleteByDisease(String disease);

    public Patient save(Patient patient);
}
