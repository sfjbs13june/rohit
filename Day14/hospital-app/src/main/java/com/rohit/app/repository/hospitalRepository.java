package com.rohit.app.repository;

import com.rohit.app.model.Hospital;
import org.springframework.data.repository.CrudRepository;

public interface hospitalRepository extends CrudRepository<Hospital,Integer> {
}
