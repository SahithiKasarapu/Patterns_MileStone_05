package com.sahithiClasses.DMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.sahithiClasses.DMS.Models.Dog;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);
}
