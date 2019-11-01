package com.rental.core.service;

import com.rental.core.model.Car;

public interface CarService {
	public Car addNewCar(Car newCar);

	public Car updateCar(Car updatedCar);

	public Car findCarById(Long carId);

	public void removeCar(Long carId);
}
