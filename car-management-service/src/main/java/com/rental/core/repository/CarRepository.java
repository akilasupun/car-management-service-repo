package com.rental.core.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rental.core.model.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

}
