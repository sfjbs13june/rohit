package com.rohit.app.repository;

import com.rohit.app.model.Hospital;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface hospitalRepository extends MongoRepository<Hospital, String>
{
    public Optional<Hospital> findById(String id);
    public Hospital findByName(String name);
    public void deleteByName(String name);
    public Hospital save(Hospital hospital);

}
