package com.rental.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rental.core.model.Car;
import com.rental.core.repository.CarRepository;

@Service
public class CarServiceImpl implements CarService {
	@Autowired
	CarRepository repository;

	@Override
	public Car addNewCar(Car newCar) {
		return repository.save(newCar);
	}

	@Override
	public Car updateCar(Car updatedCar) {
		return repository.save(updatedCar);
	}

	@Override
	public Car findCarById(Long carId) {
		return repository.findById(carId).orElse(null);
	}

	@Override
	public void removeCar(Long carId) {
		if (repository.existsById(carId))
			repository.deleteById(carId);
	}

}
