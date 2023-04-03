package com.traffic.system.services;


import com.traffic.system.entities.Vehicle;

import java.util.List;

public interface VehicleService {

    Vehicle findVehicleByLicensePlate(String licensePlate);

    void saveVehicle(Vehicle vehicle);

    List<Vehicle> findAllVehicles();
}
