package com.rental.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rental.core.model.Car;
import com.rental.core.service.CarService;

@RestController
@RequestMapping("/car-service")
public class CarInfoController {
	@Autowired
	CarService service;

	@PostMapping(value = "/addCar")
	public Car addNewCar(@RequestBody Car newCar) {
		if (newCar.getCarId() != null)
			newCar.setCarId(null);
		return service.addNewCar(newCar);
	}

	@GetMapping(path = "/getCarInfo/{Id}")
	public Car getCarDetails(@PathVariable Long Id) {
		if (Id == null)
			throw new IllegalArgumentException("Id is Null");
		return service.findCarById(Id);
	}

	@PutMapping(path = "/updateCarInfo/")
	public Car updateCarDetails(@RequestBody Car updatedCar) {
		return service.updateCar(updatedCar);
	}

	@DeleteMapping(path = "/removeCar/{carId}")
	public void removeCar(@PathVariable Long carId) {
		service.removeCar(carId);
	}
}
